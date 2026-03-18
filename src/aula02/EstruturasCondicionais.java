package aula02;
import java.util.Scanner;

public class EstruturasCondicionais {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num = teclado.nextInt();
		int num1 = teclado.nextInt();
		int num2 = teclado.nextInt();
		
		if(num >= num1 && num >= num2) {
			System.out.println(num);
			
		} else if(num1 >= num && num1 >= num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		teclado.close();
	}
}