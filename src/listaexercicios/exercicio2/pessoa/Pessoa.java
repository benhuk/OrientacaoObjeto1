package listaexercicios.exercicio2.pessoa;
/*Desenvolva um sistema para controlar registros de pessoas. Cada pessoa é identificada pelo
seu nome, sexo, cpf, idade, altura e peso, e pode andar, correr, falar e dormir. Ao invocar os
métodos da pessoa, o sistema deve exibir uma mensagem da ação que está sendo feita pela
pessoa, como por exemplo: ao invocar o método correr a mensagem “<nome da pessoa>
está correndo” deve ser exibida, ao invocar o método dormir a mensagem “<nome da pessoa>
está dormindo” deve ser mostrada, entre outras. Utilize uma classe de teste para instanciar
várias pessoas, atribuir seus respectivos valores e invocar os métodos de cada uma.*/
public class Pessoa {
	String nome;
	String sexo;
	String cpf;
	int idade;
	double altura;
	double peso;
	public void andar() {
		System.out.println(nome + " está andando");
	}
	public void correr() {
		System.out.println(nome + " está correndo");
	}
	public void falar() {
		System.out.println(nome + " está falando");
	}
	public void dormir() {
		System.out.println(nome + " está dormindo");
	}

}
