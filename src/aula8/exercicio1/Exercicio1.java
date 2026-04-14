package aula8.exercicio1;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da primeira String
        System.out.print("Digite a primeira String: ");
        String primeiraString = scanner.nextLine();

        System.out.println("\n--- Resultados ---");

        // 1. Retornar o caractere da posição 3
        // Nota: Em programação, os índices começam em 0. O índice 3 é o 4º caractere.
        if (primeiraString.length() > 3) {
            System.out.println("1. Caractere na posição 3 (índice 3): " + primeiraString.charAt(3));
        } else {
            System.out.println("1. A string1 é muito curta e não possui um caractere no índice 3.");
        }

        // 2. Retornar o número total de caracteres
        System.out.println("2. Total de caracteres: " + primeiraString.length());

        // 3. Imprimir a mesma String em letras minúsculas
        System.out.println("3. Letras minúsculas: " + primeiraString.toLowerCase());

        // 4. Dividi-la em várias substrings usando o espaço " "
        String[] substrings = primeiraString.split(" ");
        System.out.println("4. Substrings divididas pelo espaço:");
        for (int i = 0; i < substrings.length; i++) {
            System.out.println("   - " + substrings[i]);
        }

        // 5. Solicitar segunda String e comparar
        System.out.println("\n------------------");
        System.out.print("Digite a segunda String para comparação: ");
        String segundaString = scanner.nextLine();

        // Comparação usando .equals() (importante em Java para comparar conteúdo de Strings)
        if (primeiraString.equals(segundaString)) {
            System.out.println("As Strings são IGUAIS!");
        } else {
            System.out.println("As Strings são diferentes.");
        }

        scanner.close();
    }
}