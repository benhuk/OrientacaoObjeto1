/*
 * Objetivo: Fazer o computador gerar um número aleatório e você tentar adivinhar com dicas.

O que o programa deve fazer:

    O programa deve "pensar" em um número entre 1 e 100.

    Peça para o usuário digitar um palpite.

    Se o palpite for maior que o número secreto, imprima: "Errou! O número secreto é MENOR."

    Se o palpite for menor, imprima: "Errou! O número secreto é MAIOR."

    O programa deve continuar pedindo palpites até o usuário acertar o número exato.

    Quando ele acertar, mostre: "Parabéns! Você acertou em X tentativas!" (Você terá que criar uma variável para contar quantas vezes ele tentou).

💡 Dica de ouro: Para o Java sortear um número de 1 a 100, use este código logo no início do main:
int numeroSecreto = (int) (Math.random() * 100) + 1;*/
package aula01;

import java.util.Scanner;

public class JogoAleatoriedade {
	public static void main(String[] args) {
		int loop = 0;
		int tentativas = 0;
		int numeroSecreto = (int) (Math.random() * 100) + 1;
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		while (loop != 1) {
			System.out.print("Digite um chute de 1 a 100\n");
			numero = teclado.nextInt();
			tentativas++;
			if(numero > 100 || numero < 1) {
				System.out.print("Apenas valores de 1 a 100 são aceitos!");
			}else if (numero == numeroSecreto) {
				System.out.println("Parabéns, você acertou com " + tentativas + " tentativas");
				loop = 1;
			}else if(numero > numeroSecreto) {
				System.out.print("o numero é menor!\n");
			}else if(numero < numeroSecreto) {
			System.out.print("o numero é maior!\n");
		}

			
		}
	}
}
