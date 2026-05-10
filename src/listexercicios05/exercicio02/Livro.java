package listexercicios05.exercicio02;
/*Desenvolva um sistema para a biblioteca da UTFPR. A biblioteca deve controlar os N livros do seu
acervo. Cada livro é identificado pelo seu título, autor, ano de publicação, editora, número total de
páginas. O sistema deve permitir que a biblioteca:
- (i) efetuar empréstimo de um livro, para isso, é necessário saber o título do livro e o dia que está sendo
efetuado a tentativa de empréstimo. O empréstimo só deverá ocorrer se o livro estiver disponível. O dia
do empréstimo deve ser armazenado, pois esta informação será útil no momento da devolução do livro.
- (ii) efetuar a devolução de um livro que está emprestado. Para isso, é necessário saber o título do livro
que está sendo devolvido e o dia que está ocorrendo a devolução.
Após realizar a devolução, deve-se verificar se há multa a ser cobrada. Sabe-se que o livro pode ser
emprestado durante 7 dias sem gerar multa, caso seja extrapolado esse período, deve-se gerar multa
de R$1,50 por dia de atraso. A fim de simplificar o exercício, adote apenas valores inteiros para
determinar o dia de empréstimo e devolução dos livros. Exemplo. O livro foi emprestado dia 5 e
devolvido de 11, sem a necessidade de determinar do mês que ocorreu o empréstimo/devolução.
Desconsidere que o livro pode ser devolvido em uma data anterior ao empréstimo, por exemplo,
emprestar dia 5 e devolver dia 3. Para realizar a execução das funcionalidades requeridas, utilize uma
classe de testes*/
public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String editora;
	private int numeroTotalPaginas;
	
	private int diaEmprestimo;
	private boolean disponivel;
	
	public Livro(String titulo, String autor, int anoPublicacao, String editora, int numeroTotalPaginas) {
		// Correção: o 'this.' deve vir do lado esquerdo da igualdade
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
		this.numeroTotalPaginas = numeroTotalPaginas;
		this.disponivel = true;
	}

	public int getDiaEmprestimo() {
		return diaEmprestimo;
	}

	public void setDiaEmprestimo(int diaEmprestimo) {
		this.diaEmprestimo = diaEmprestimo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public int getNumeroTotalPaginas() {
		return numeroTotalPaginas;
	}

	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
}
