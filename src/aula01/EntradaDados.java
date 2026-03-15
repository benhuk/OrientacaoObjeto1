package aula01;
import java.util.Scanner;
public class EntradaDados {
	public static void main(String[] args) {
		double numero3 = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um numero:");
		double numero1 = teclado.nextDouble();
		
		System.out.print("Digite a operacao que gostaria de realizar <+,-,*,/>:");
		String operacao = teclado.next();
		
		System.out.print("Digite o segundo numero:");
		double numero2 = teclado.nextDouble();
		
		switch(operacao) {
		case "+":
			numero3 = numero1+numero2;
			break;
		case "-":
			numero3 = numero1-numero2;
			break;
		case "*":
			numero3 = numero1*numero2;
			break;
		case "/":
			numero3= numero1/numero2;
			break;
		default:
			System.out.print("Valores Invalidos.");
			
		}
		System.out.println("O resultado é:" + numero3);
		teclado.close();
	}
}
