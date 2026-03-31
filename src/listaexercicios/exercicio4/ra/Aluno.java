package listaexercicios.exercicio4.ra;
/*
 * 
 * esenvolva um sistema para manter o registro de alunos. Cada aluno é identificado pelo seu
número de RA, nome, curso, turno, período, coeficiente e situação. Cada aluno também pode
responder chamada, fazer avaliação e imprimir um relatório dos seus próprios dados (método
toString() ). Ao invocar o método de responder chamada, a mensagem “<nome do aluno>
está respondendo a chamada” deve ser mostrada. Ao invocar o método fazer avaliação, a
mensagem “<nome do aluno> está fazendo avaliação” deve ser exibida. Por fim, o método
imprimir relatório com os dados do aluno deve escrever em console todos os valores dos
atributos dos aluno, como RA, nome, curso, turno, período, coeficiente e situação. Para instanciar objetos e atribuir
 os valores e invocar os métodos para cada aluno, declare uma
classe de teste.
 * */
public class Aluno {
	int ra;
	String nome;
	String curso;
	String turno;
	int periodo;
	double coeficiente;
	String situacao;
	
	public void responderChamada() {
		System.out.println(nome +" está respondendo a chamada");
	}
	public void fazerAvaliacao() {
		System.out.println(nome +" está fazendo avaliação");
	}
	@Override
	public String toString() {
		return "ra:" + ra + "\nnome: " + nome + "\ncurso:" + curso + "\nturno:" + turno + "\nperiodo:" + periodo + "\ncoeficiente:" + coeficiente + "\nsituacao:" +situacao;
	}
}
