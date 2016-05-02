/**
Autores: Cássio Deon e Roger Calderini
**/
grammar exercicio1_sonda;

instrucao:  (comando NEWLINE*)* ;
comando :   basico condicao
        |   basico
        |   '(' comando ')'
        ;
condicao:   'ENTAO' comando
        |   'APOS' comando
        ;
basico  :   'FRENTE' distancia
        |   'ESQUERDA' distancia
        |   'DIREITA' distancia
        |   'TRAS' distancia
        ;
distancia: Numero;
Numero: [0-9]+(.[0-9]+)*;
NEWLINE : [\r\n]+;
WS: [ \T] -> skip;