package aula02;
import java.util.Scanner;

public class EntradaDados {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome completo:");
		String nome = teclado.nextLine();
		
		System.out.println("seu sexo:");
		String sexo = teclado.nextLine();
		
		System.out.println("estado civil:");
		String estadocivil = teclado.nextLine();
		
		System.out.println("quantidade de filhos:");
		int qtdfilhos = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("escolariedade:");
		String escolaridade = teclado.nextLine();
		
		System.out.println("renda mensal");
		double renda = teclado.nextDouble();
		
		System.out.println("nome completo:" + nome + " sexo:" +sexo + " estadocivil:" + estadocivil + " quantidade de filhos:" + qtdfilhos + " escolaridade:" + escolaridade + " renda:" + renda);
	}
	
}
