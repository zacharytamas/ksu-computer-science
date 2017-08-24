"""
scanner.py
"""

from token import Token
from token_types import Tokens, KEYWORDS, KEYWORDS_LOOKUP
from symbol_table import SymbolTable


class ScannerMode(object):

  def __init__(self, start):
    if not self.__class__.isValidStart(start):
      raise ValueError("Starting character invalid.")
    self.value = start

  @classmethod
  def isValidStart(cls, char):
    raise NotImplementedError("This must be implemented.")

  def isValidNext(self, char):
    raise NotImplementedError("This must be implemented.")

  def close(self):
    raise NotImplementedError("This must be implemented.")

  def add(self, char):
    raise NotImplementedError("This must be implemented.")


class NumberMode(ScannerMode):

  def __init__(self, start):
    super(NumberMode, self).__init__(start)
    self.number_initializer = int

  @classmethod
  def isValidStart(cls, char):
    return char.isdigit()

  def isValidNext(self, char):
    return char.isdigit() or char == '.'

  def add(self, char):
    # If the char is a dot, switch our initializer to float,
    # it's not an integer anymore.
    if (char == '.'):
      self.number_initializer = float
    self.value += char

  def close(self):
    # TODO should return a FLOAT token if applicable
    return Token(Tokens.INTEGER, self.number_initializer(self.value))


class StringMode(ScannerMode):

  def __init__(self, value):
    self.value = value
    self.active = True
    self.quote_type = value

  @classmethod
  def isValidStart(cls, char):
    return char in ('"', "'")

  def isValidNext(self, char):
    return self.active

  def add(self, char):
    self.value += char

    # If this is an ending quote, mark inactive.
    # This means we've reached the end of the string.
    if char == self.quote_type:
      self.active = False

  def close(self):
    return Token(Tokens.STRING, self.value)


class Scanner(object):
  """
  A lexical analyzer for our language.

  Capable of taking a given source and returning tokens from it.
  """

  def __init__(self, source):
    self.source = source
    self.line = 1
    self.col = 0
    self.position = 0
    self.current_token = None
    self.symbol_table = SymbolTable()
    self.current_char = self.source[self.position]
    self.current_mode = None

  def seek(self):
    "Advances the lexer's position"

    # If seeking pushes us into the next line, record that.
    if self.current_char == '\n':
      self.col = 0
      self.line += 1

    self.position += 1
    self.col += 1

    if (self.position > len(self.source) - 1):
      self.current_char = None
    else:
      self.current_char = self.source[self.position]

  def next(self):
    "Returns the next token discovered."

    while self.current_char is not None:

      if self.current_mode is not None:
        if self.current_mode.isValidNext(self.current_char):
          self.current_mode.add(self.current_char)
          self.seek()
          continue
        else:
          token = self.current_mode.close()
          self.current_mode = None
          self.seek()
          return token

      # If we're outside of a mode, attempt to find one

      for mode in [NumberMode, StringMode]:
        if mode.isValidStart(self.current_char):
          self.current_mode = mode(self.current_char)
          self.seek()

      # IF no new mode was found, move to next character and start over
      if self.current_mode is None:
        self.seek()

    if self.current_mode:
      return self.current_mode.close()






def scanner_from_file(filepath):
  with open(filepath, 'r') as f:
    return Scanner(f.read())

scanner = scanner_from_file('test1.scl')

print scanner.next()
print scanner.next()
print scanner.next()

