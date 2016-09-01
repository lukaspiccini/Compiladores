grammar Numbers;

/*
// Descomente para gerar codigo em c#
options {
    language=CSharp;
}
*/

number: BINARY; // precisa ao menos uma regra de gramática
                 // ignorar isso por hora

NEWLINE : [\r\n ]+;

BINARY : BIN_DIGIT+ 'b' ; // Sequencia de digitos seguida de b  10100b

BIN_DIGIT : [01];

DECIMAL: [-]?[0-9]+;

HEXADECIMAL:  [0][x][0-9a-fA-F]+;

REAL: [-]?[0-9]+'.'?[0-9]+([e][-+]?[0-9]+)?;
