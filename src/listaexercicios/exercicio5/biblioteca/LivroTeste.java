package listaexercicios.exercicio5.biblioteca;

public class LivroTeste {
	public static void main(String []args) {
		Livro livro1 = new Livro();
		
		livro1.titulo = "haha";
		livro1.autor = "pedin";
		livro1.editora = "receba";
		livro1.numeroDePaginas = 2000;
		livro1.anoDePublicacao = 2025;
		livro1.situacao = "disponivel";
		livro1.realizarEmprestimo();
		livro1.realizarEmprestimo();
		livro1.realizarDevolucao();
		livro1.realizarDevolucao();
		System.out.println(livro1.toString());
	}
}
