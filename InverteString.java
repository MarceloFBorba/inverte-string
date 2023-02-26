import java.util.Scanner;

public class InverteString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar a entrada da string a ser invertida
        System.out.print("Digite uma string: ");
        String string = sc.nextLine();

        // Converter a string em um array de caracteres
        char[] chars = string.toCharArray();

        // Inverter o array de caracteres
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        // Criar uma nova string a partir do array de caracteres invertido
        String stringInvertida = new String(chars);

        // Imprimir a string invertida
        System.out.println("String original: " + string);
        System.out.println("String invertida: " + stringInvertida);
    }
}
