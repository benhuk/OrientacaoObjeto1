/*Exercício
Crie uma classe Pessoa de acordo com o modelo
abaixo:
Pessoa
nome: String
idade: Integer
peso: Double
andar( ) : void
correr( ) : void
falar( ) : void*/
package aula3;

public class Pessoa {
	String nome;
	int idade;
	double peso;
	public void andar(){
		System.out.println(nome +" está andando");
	}
	public void correr(){
		System.out.println(nome + " está correndo");
	}
	public void falar() {
		System.out.println(nome + " está falando");
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + "]";
	}

}
