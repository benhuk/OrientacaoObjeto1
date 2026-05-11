package listaexercicios05.exercicio04;

import java.util.List;
import java.util.ArrayList;

/*Desenvolva um sistema para gerenciar situações dos alunos em uma determinada disciplina. A
disciplina possui um nome e vários alunos que são identificados pelo seu número de RA e nome. Sabe-
se que o professor da disciplina aplica N avaliações, ou seja, cada aluno poderá possuir várias notas
(double).

Com essas informações, desenvolva um software em que seja possível matricular alunos na disciplina.
Para isto, é necessário saber o RA e o Nome do aluno que será matriculado.

Por meio da disciplina, deve ser possível lançar as notas para cada aluno. Neste caso, é necessário
ter conhecimento do RA do aluno, além do valor (apenas um) da nota deste aluno. O sistema deve
localizar o o aluno correspondente ao RA e atribuí-lo a nota recebida. Este processo pode ocorrer mais
de uma vez por aluno. Por exemplo, quando o aluno de RA 123 faz a primeira avaliação, esta nota é atribuída a ele.

 Posteriormente, na segunda avaliação, será lançada uma segunda nota ao aluno de RA 123, e assim por diante, com todos os alunos da disciplina.

Por fim, a funcionalidade de finalizar o semestre deve calcular a média aritmética de cada aluno e a
média aritmética da disciplina, sendo que cada cálculo deve ficar em sua respectiva classe. Lembrando
que o cálculo da média de cada aluno só poderá ser invocado da classe Disciplina, pois é ela quem
detém os alunos que nela estão matriculados.

O método que calculará a média de cada aluno deve imprimir o RA e nome do aluno, além do resultado
do cálculo seguido da situação do aluno (Aprovado ou Reprovado) de acordo com sua média final.
Adote que a média final igual ou superior a 6.0 o aluno é considerado aprovado, caso contrário,
reprovado.

O método que calculará a média das notas da disciplina imprimirá o nome da disciplina e o resultado
do cálculo da média aritmética de todos os alunos da turma. Obs.: Não utilize o método toString( )
para a impressão dos dados do aluno e da turma.
Para inicializar o sistema e invocar os métodos a fim de testá-los, utilize a classe específica de testes.*/
public class Aluno {

	private List<Double> notas;
	
	public Aluno(int ra, String nome) {
		this.ra = ra;
		this.nome = nome;
		this.notas = new ArrayList<Double>();
	}
	
	public int getRa() {
		return ra;
	}
	public String getNome() {
		return nome;
	}
	private int ra;
	private String nome;
	public void adicionarNota(double nota) {
		notas.add(nota);
	}
	public double calcularMedia() {
		double valorMedia = 0.0;
		if(!notas.isEmpty()) {
			for(Double n : notas) {
				valorMedia += n;
			}
			
			double media = valorMedia/notas.size();
			this.verificarSituacaoAluno(valorMedia);
			return media;
		}else {
			System.out.println("notas esta vazio");
			return 0.0;
		}
	}

	public void verificarSituacaoAluno(double media) {
		System.out.println("ra:" + this.ra);
		System.out.println("ra:" + this.nome);
		if(media >= 6.0) {
			System.out.println("aluno aprovado com: " + media);
		}else {
			System.out.println("aluno reprovado com media:" + media );
		}
	}
	
}
