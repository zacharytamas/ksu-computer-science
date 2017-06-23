"""
scanner.py
"""

from enum import Enum

class Tokens(Enum):
    "Types of tokens"

    ASSIGNMENT = 1
    LESS_THAN_OR_EQUAL = 2
    LESS_THAN = 3
    GREATER_THAN_OR_EQUAL = 4
    GREATER_THAN = 5
    EQUAL = 6
    NOT_EQUAL = 7
    ADD = 8
    SUB = 9
    MUL = 10
    DIV = 11


print Tokens.ADD
