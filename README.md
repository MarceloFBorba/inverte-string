Esse programa em Java inverte os caracteres de uma string
 - ele não usa funções prontas
 
 Para que possamos inverter os caracteres de uma string convertemos a string em um array de caracteres "char[] chars = string.toCharArray();"
 Invertemos o array de caracteres usando um loop "for (int i = 0, j = chars.length - 1; i < j; i++, j--)"
 e criamos uma nova string a partir do array de caracteres invertido "new String(chars);", com isso o resultado nos apresenta a string invertido.
