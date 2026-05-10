package listexercicios05.exercicio02;

import java.util.ArrayList;
import java.util.List;

/*
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
public class Biblioteca {
	private List <Livro> livros;
	private final double MULTA_POR_DIAS_ATRASO;
	private final int QUANTIDADE_DIAS_PERMITIDOS;
	
	public Biblioteca() {
		this.livros = new ArrayList<Livro>();
		this.MULTA_POR_DIAS_ATRASO = 1.5;
		this.QUANTIDADE_DIAS_PERMITIDOS = 7;
		this.iniciarLivros();
	}
	public void iniciarLivros() {
		this.livros.add(new Livro("Java - Como Programar", "Paul Deitel", 2016, "Pearson", 968));
		this.livros.add(new Livro("Sistemas Operacionais Modernos", "Andrew Tanenbaum", 2015, "Pearson", 864));
		this.livros.add(new Livro("Engenharia de Software", "Roger Pressman", 2021, "AMGH", 704));
	}
	
	public void realizarEmprestimo(String titulo, int diaEmprestimo) {
		Livro livro = this.buscarLivro(titulo);
		if(livro == null) {
			System.out.println("livro nao encontrado");
			return;
		}
		if(livro.isDisponivel()) {
			livro.setDisponivel(false);
			livro.setDiaEmprestimo(diaEmprestimo);
			System.out.println("O livro " + titulo + " foi emprestado com sucesso.");
		}else {
			System.out.println("O livro " + titulo + " encontra-se indisponivel");
		}
	}
	private Livro buscarLivro(String titulo) {
		for(Livro livro : livros) {
			if(livro.getTitulo().equals(titulo)) {
				return livro;
			}
		}
		return null;
	}
	public void realizarDevolucao(String titulo, int diaDevolucao) {
		Livro livro = this.buscarLivro(titulo);
		if(livro == null) {
			System.out.println("livro nao encontrado");
			return;
		}
		if(!livro.isDisponivel()) {
			this.verificarAtraso(livro, diaDevolucao);
			livro.setDisponivel(true);
			livro.setDiaEmprestimo(0);
			
			System.out.println("O livro " + titulo + " foi devolvido com sucesso.");
		}else {
			System.out.println("O livro " + titulo + " já encontra-se disponivel.");
		}
	}
	private void verificarAtraso(Livro livro, int diaDevolucao) {
		
		int diasComLivro = diaDevolucao - livro.getDiaEmprestimo();
		
		if(diasComLivro > this.QUANTIDADE_DIAS_PERMITIDOS) {
			
			int diasExcedentes = diasComLivro - this.QUANTIDADE_DIAS_PERMITIDOS;
			this.calcularMulta(diasExcedentes);
		}
	}
	
	private void calcularMulta(int diasExcedentes) {
		
		double valorMulta = diasExcedentes * this.MULTA_POR_DIAS_ATRASO;
		System.out.println("Multa à pagar: R$" + valorMulta);
	}
}
