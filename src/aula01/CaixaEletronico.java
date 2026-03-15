/*💻 Desafio 1: O Caixa Eletrônico (Loop + Switch)

Objetivo: Criar um menu que não fecha até o usuário mandar, simulando uma conta bancária.

O que o programa deve fazer:

    Comece o programa com uma variável double saldo = 1000.00;.

    Mostre um menu com 4 opções: [1] Ver Saldo, [2] Depositar, [3] Sacar, [4] Sair.

    Leia a opção do usuário.

    Se ele escolher 1, mostre o saldo.

    Se escolher 2, pergunte o valor, some ao saldo e mostre o novo saldo.

    Se escolher 3, pergunte o valor. Regra: Ele não pode sacar mais do que tem no saldo. Se tentar, mostre "Saldo insuficiente". Se tiver dinheiro, subtraia e mostre o novo saldo.

    O grande truque: O programa deve ficar repetindo esse menu indefinidamente até que o usuário digite a opção 4 (Sair).

💡 Dica de ouro: Você vai precisar colocar o seu menu e o seu switch dentro de um bloco while (opcao != 4) { ... }.*/
package aula01;
import java.util.Scanner;
public class CaixaEletronico {
	public static void main(String[] args) {
		int loop = 0;
		
		double saldo = 1000;
		double aux = 0;
		Scanner teclado = new Scanner(System.in);
		
		while(loop != 4) {
			System.out.print("Bem-vindo!\ndigite:\n <1> para mostrar saldo\n <2> para depositar\n <3> para sacar\n <4> para sair\n");
			loop = teclado.nextInt();
			
			switch (loop){
			case 1:
				System.out.println("seu saldo é de:" + saldo);
				break;
			case 2:
				System.out.print("digite o valor que deseja depositar:");
				aux = teclado.nextDouble();
				saldo += aux;
				System.out.println("Deposito realizado com sucesso!\n seu novo saldo é de:" + saldo);
				break;
			case 3:
				System.out.print("digite o valor que deseja sacar:");
				aux = teclado.nextDouble();
				if(aux > saldo) {
					System.out.print("Saldo insuficiente para saque");
					break;
				}else{
					saldo -=aux;
					System.out.println("Saque realizado com sucesso!\n seu novo saldo é de:" + saldo);
				}
				break;
			case 4:
				System.out.print("saindo...");
				loop = 4;
				break;
			default:
				System.out.println("valor inválido! escolha outra opcao!");
		
			}
		}

	}
	
}

