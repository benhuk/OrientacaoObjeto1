package listaexercicios.exercicio5.biblioteca;
/*5. Uma biblioteca deseja manter catalogados todos os seus livros. Você foi contratado para
desenvolver este sistema. Sabe-se que o livro é formado pelo seu título, autor, editora, número
de páginas, ano de publicação e situação. O atributo “situação” controla se o livro está
disponível ou não para empréstimo. Logo, esta biblioteca realiza empréstimos e devoluções
dos livros aos seus usuários. Para realizar o empréstimo de um livro, é necessário que o
mesmo esteja disponível, ou seja, que já não tenha sido emprestado anteriormente. Para
realizar a devolução de um livro, o mesmo deve estar como situação indisponível, ou seja,
estar emprestado. Outra funcionalidade que deve ser possível é a exibição em tela dos dados
do livro, como uma espécie de relatório que pode ser implementado por meio do método
toString( ), contendo o título, autor, editora, número de páginas, ano de publicação e a situação
do livro (se está ou não disponível).
Exemplo: “Java – Como Programar, Paul Deitel, Editora Pearson, 968 páginas, 2016,
disponível para empréstimo”.
Para efetuar a instanciação dos livros, definição dos valores de seus atributos e invocar os
métodos de empréstimo, devolução ou relatórios, utilize uma classe de teste.*/
public class Livro {
	String titulo;
	String autor;
	String editora;
	int numeroDePaginas;
	int anoDePublicacao;
	String situacao = "disponivel";
	public void realizarEmprestimo() {
		if(situacao == "disponivel") {
			situacao = "indisponivel";
			System.out.println(titulo +" emprestado com sucesso");
			
		}else {
			System.out.println(titulo + " não está disponível");
		}
	}
	public void realizarDevolucao() {
		if(situacao == "indisponivel") {
			situacao = "disponivel";
			System.out.println(titulo +" devolvido com sucesso");
		}else {
			System.out.println(titulo +" nao encontra-se emprestado no momento.");
		}
	}
	@Override
	public String toString() {
		return "titulo:" + titulo + "\nautor:" + autor + "\neditora:" + editora
				+ "\nnumero de paginas:" + numeroDePaginas + "\nano de publicacao:"
				+ anoDePublicacao + "\nsituacao:" + situacao;
	}
}
