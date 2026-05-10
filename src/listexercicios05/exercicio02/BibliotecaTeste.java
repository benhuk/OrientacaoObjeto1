
package listexercicios05.exercicio02;

public class BibliotecaTeste {
	public static void main(String [] args) {
		
		Biblioteca biblioteca = new Biblioteca();
		
		biblioteca.realizarEmprestimo("Sistemas Operacionais Modernos", 10);
		
		biblioteca.realizarEmprestimo("Sistemas Operacionais Modernos", 10);
		biblioteca.realizarDevolucao("Sistemas Operacionais Modernos", 50);
	}
}
