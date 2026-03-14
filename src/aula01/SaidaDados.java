package aula01;

public class SaidaDados {
	public static void main(String []args) {
		String nome = "Pedrinho Da Silva";
		int idade = 30;
		double peso = 78.4;

		System.out.println("Aluno: Joao da Silva");
		System.out.println("Curso: BCC");
		System.out.println("-------- imprimindo com variaveis --------");
		
		System.out.println("Nome:" + nome + " Idade:" + idade +" peso:" + peso );
		System.out.printf("Nome: %s Idade:%d Peso:%f ", nome,idade,peso);

		
	}
}
