grammar Hello;

TYPE : 'int';
BOOLVALUE : 'True' | 'False';
DIGIT : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
LETTER : 'a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'k'|'l'|'m'|'n'|'o'|'p'|'q'|'r'|'s'|'t'|'u'|'v'|'w'|'x'|'y'|'z'|
          'A'|'B'|'C'|'D'|'E'|'F'|'G'|'H'|'I'|'J'|'K'|'L'|'M'|'N'|'O'|'P'|'Q'|'R'|'S'|'T'|'U'|'V'|'W'|'X'|'Y'|'Z'|'_';
RELATEOPERATOR : '==' | '!=' | '<=' | '>=' | '<' | '>';
PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';
MOD : '%';
LPAREN : '(';
RPAREN : ')';
FOR : 'for';
IF : 'if';
ELSE : 'else';
STARTBLOCK : '{';
ENDBLOCK : '}';
PRINT : 'print';
AND : 'and';
OR : 'or';
EQUAL : '=';
SEMI : ';';
BOOL : 'bool';
IN : 'in';
STEP : 'step';
TO : 'to';


program : statementList;
statementList : statement statementList
                | statement;
statement : statement1 SEMI
            | statement2;
statement1 : assignment | print | declaration;
statement2 : loop | control;

declaration : TYPE identifier
              | BOOL identifier;

assignment : TYPE identifier EQUAL expression
            | identifier EQUAL expression
            | BOOL identifier EQUAL BOOLVALUE;

print : PRINT LPAREN expression RPAREN;

loop : FOR LPAREN TYPE identifier IN expression TO expression RPAREN STARTBLOCK statementList ENDBLOCK
      | FOR LPAREN TYPE identifier IN expression TO expression STEP expression RPAREN STARTBLOCK statementList;

control : IF LPAREN booleanExpression RPAREN STARTBLOCK statementList ENDBLOCK
         | IF LPAREN booleanExpression RPAREN STARTBLOCK statementList ENDBLOCK ELSE STARTBLOCK statementList ENDBLOCK;

booleanExpression : expression RELATEOPERATOR expression
                   | booleanExpression AND booleanExpression
                   | booleanExpression OR booleanExpression
                   | BOOLVALUE;

expression : term PLUS expression
            | term MINUS expression
            | term;

term : factor MULTIPLY term
      | factor DIVIDE term
      | factor MOD term
      | factor;

factor : LPAREN expression RPAREN | number | identifier;

number : DIGIT number | DIGIT;

identifier : LETTER temp | LETTER;
temp : LETTER temp | DIGIT temp | LETTER | DIGIT;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
