/*📝 Desafio 1: O Analista de Textos (Strings e laço for)

Objetivo: Sair um pouco dos números e descobrir como o Java manipula palavras (Strings).

O que o programa deve fazer:

    Peça para o usuário digitar uma palavra qualquer.

    Imprima na tela quantas letras essa palavra tem.

    Imprima a palavra inteira em LETRAS MAIÚSCULAS.

    O grande desafio: Use um laço de repetição (recomendo o for) para passar por cada letra da palavra e contar quantas vogais (a, e, i, o, u) ela possui. Imprima esse total no final.

💡 Dicas de ouro:

    Para saber o tamanho: int tamanho = palavra.length();

    Para deixar maiúscula: String maiuscula = palavra.toUpperCase();

    Para pegar uma letra específica numa posição i: char letra = palavra.charAt(i);*/
package aula01;
import java.util.Scanner;
public class OdeioLetrasMinusculas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		System.out.print("Digite qualquer palavra:");
		String palavra = teclado.next();
		
		int tamanho = palavra.length();
		System.out.println("tamanho da palavra:" + tamanho);
		
		String maiuscula = palavra.toUpperCase();
		System.out.println("palavra toda em maiusculas:" + maiuscula);
		
		for(int i = 0;i<palavra.length();i++) {
			char letras = palavra.charAt(i);
			
		}
		
		
	}
}
