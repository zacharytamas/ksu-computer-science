from enum import Enum

KEYWORDS = """specifications symbol forward references function pointer
array type struct integer enum global declarations implementations main
parameters constant begin endfun if then else endif repeat until endrepeat
display set return import""".split()
KEYWORDS_LOOKUP = {}
for i, keyword in enumerate(KEYWORDS):
  KEYWORDS_LOOKUP[keyword] = 1000 + i


class Tokens(Enum):
  "Types of tokens."

  INTEGER = 'integer'
  KEYWORD = 'KEYWORD'
  STRING = 'STRING'  # This is a temporary catch all
  ASSIGNMENT = '='
  LESS_THAN_OR_EQUAL = '<='
  LESS_THAN = '<'
  GREATER_THAN_OR_EQUAL = '>='
  GREATER_THAN = '>'
  EQUAL = '=='
  NOT_EQUAL = '~='
  ADD = '+'
  SUB = '-'
  MUL = '*'
  DIV = '/'