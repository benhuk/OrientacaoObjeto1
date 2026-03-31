package listaexercicios.exercicio2.pessoa;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa joao = new Pessoa();

		joao.nome = "pedro";
		joao.sexo = "masculino";
		joao.cpf = "1234";
		joao.idade = 15;
		joao.altura = 1.55;
		joao.peso = 88.55;
		
		joao.andar();
		joao.correr();
		joao.falar();
		joao.dormir();
	}
}
