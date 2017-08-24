
class Token(object):
  "A token as discovered by a scanner."

  def __init__(self, token_type, value, location=None):
    self.location = location
    self.type = token_type
    self.value = value

  def __repr__(self):
    return '%s(%s)' % (
      self.type,
      repr(self.value)
    )
