/gramatyka zostaa wygenerowana na podstawie Java8 z ANTLR/
/gramatyka oraz jezyk wykonywany z zamyslem jezyka szkoleniowego dla dzieci uczacych sie informatyki/
grammar Shadow;

STALA : 'stala';
ALBO : 'albo';
DLA : 'dla';
JESLI : 'jesli';
IDZ : 'idz';
NOWE : 'nowe';
ZWROC : 'zwroc';
DOPOKI : 'dopoki';

BOOLEAN:	'prawda'  |	'falsz';
NIC:	'null';

LNAWIAS : '(';
PNAWIAS : ')';
LKLAMROWY : '{';
PKLAMROWY : '}';
LKWADRAT : '[';
PKWADRAT : ']';
CUDZYSLOW : ';';
PRZECINEK : ',';
KROPKA : '.';
PRZYPISANIE : '=';
WIEKSZE : '>';
MNEIJSZE : '<';
WYKRZYKNIK : '!';
TYLDA : '~';
PYTAJNIK : '?';
DWUKROPEK : ':';
POROWNANIE : '==';
MNIEJSZEROWNE : '<=';
WIEKSZEROWNE: '>=';
NIEROWNE : '!=';
I : '&&';
LUB : '||';
ZWIEKSZENIE : '++';
ZMNIEJSZENIE : '--';
PLUS: '+';
MINUS : '-';
MNOZENIE : '*';
DZIELENIE : '/';
BITI : '&';
BITLUB : '|';
KONIUNKCJA : '^';
MODULO : '%';
STRZALKA : '->';
PODWOJNYDWUKROPEK : '::';

fragment
LITERY:	[a-zA-Z$_];
LICZBY: [0-9]

KOMENTARZ:   '/*' .*? '*/' -> channel(HIDDEN);
LINIAKOMENTARZA:   '//' ~[\r\n]* -> channel(HIDDEN);
