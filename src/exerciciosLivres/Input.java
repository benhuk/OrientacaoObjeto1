package exerciciosLivres;
import java.util.Scanner;
public class Input {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seu nome:");
		String nome = teclado.nextLine();
		System.out.print("Digite sua idade:");
		int idade = teclado.nextInt();
		System.out.println("Ola " + nome + "\nsua idade e: " + idade + " anos.");
	}
}
