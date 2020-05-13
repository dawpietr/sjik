//gramatyka zostaa wygenerowana na podstawie Java8 z ANTLR/
//gramatyka oraz jezyk wykonywany z zamyslem jezyka szkoleniowego dla dzieci uczacych sie informatyki/
grammar Shadow;


program: (komunikat)*;

komunikat:  komentarz
            |wyrazenie
            |utworzenie_stalej
            |utworzenie_zmiennej
            |zmiana_zmiennej
            |zapytanie_jesli
            |petla_dopoki
            |petla_dla
            |deklaracja_funkcji
            |wywolanie_funkcji
            ;

komentarz           :LINIAKOMENTARZA
                    |KOMENTARZ
                    ;
utworzenie_stalej   : STALA lewa=wyrazenie PRZYPISANIE prawa=wyrazenie;
utworzenie_zmiennej : ZMIENNA lewa=wyrazenie PRZYPISANIE prawa=wyrazenie;
zmiana_zmiennej     : lewa=wyrazenie PRZYPISANIE prawa=wyrazenie;

wyrazenie          :lewa=wyrazenie PLUS   prawa=wyrazenie          #wyrazeniedodawania
                   |lewa=wyrazenie MINUS prawa=wyrazenie          #wyrazenieodejmowania
                   |lewa=wyrazenie MNOZENIE prawa=wyrazenie       #wyrazeniemnozenia
                   |lewa=wyrazenie DZIELENIE prawa=wyrazenie      #wyrazeniedzielenia
                   |lewa=wyrazenie POTEGOWANIE prawa=wyrazenie    #wyrazeniepotegowania
                   |lewa=wyrazenie ZWIEKSZENIE                     #wyrazeniezwiekszenie
                   |lewa=wyrazenie ZMNIEJSZENIE                    #wyrazeniezmniejszenie
                   |lewynaw wyrazenie prawynaw                      #wyrazenienawias
                   |wywolanie_funkcji                              #wyrazeniefunkcja
                   |SLOWA                                          #wyrazenieslowa
                    ;
zapytanie_jesli     :;
petla_dopoki        :;
petla_dla           :;
deklaracja_funkcji  :;
wywolanie_funkcji   :;

lewynaw:'(''[''{';
prawynaw:')''}'']';
STALA   : 'stala';
ZMIENNA : 'zmienna';
ALBO    : 'albo';
DLA     : 'dla';
JESLI   : 'jesli';
IDZ     : 'idz';
ZWROC   : 'zwroc';
DOPOKI  : 'dopoki';

BOOLEAN :	'prawda'  |	'falsz';
NIC     :	'null';

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
MNIEJSZE : '<';
WYKRZYKNIK : '!';
PYTAJNIK : '?';
DWUKROPEK : ':';
POROWNANIE : '==';
NIEROWNE : '!=';
I : '&&';
LUB : '||';
ZWIEKSZENIE : '++';
ZMNIEJSZENIE : '--';
PLUS: '+';
MINUS : '-';
MNOZENIE : '*';
DZIELENIE : '/';
POTEGOWANIE: '^';
BITI : '&';
BITLUB : '|';
MODULO : '%';
STRZALKA : '->';
PODWOJNYDWUKROPEK : '::';

SLOWA: [a-zA-Z] ([a-zA-Z_] | LICZBY)* ;
LITERY:	[a-zA-Z$_]*;
LICZBY: [0-9]+;

KOMENTARZ:   '/*' .*? '*/' -> channel(HIDDEN);
LINIAKOMENTARZA:   '//' ~[\r\n]* -> channel(HIDDEN);
