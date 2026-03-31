package listaexercicios.exercicio4.ra;

public class AlunoTeste {
	public static void main(String []args) {
		Aluno pedro = new Aluno();
		pedro.ra = 55556;
		pedro.nome = "Pedro";
		pedro.curso = "Ciencias biologicas";
		pedro.turno = "manha";
		pedro.periodo =  5;
		pedro.coeficiente =  55.7;
		pedro.situacao = "regular";
		pedro.fazerAvaliacao();
		pedro.responderChamada();
		System.out.println(pedro.toString());
	}
}
