package aula3;
/*Nome: João
Idade: 25
Peso: 68,5
Nome: Maria
Idade: 30
Peso: 55,6
Nome: José
Idade: 32
Peso: 62,4*/
public class PessoaTeste {
	public static void main(String[] args) {
		// instanciando:
		
		Pessoa joao = new Pessoa();
		Pessoa maria = new Pessoa();
		Pessoa jose = new Pessoa();
		
		// atribuindo valores aos objetos:
		joao.nome = "Joao";
		joao.idade = 25;
		joao.peso = 68.5;
		maria.nome = "Maria";
		maria.idade = 25;
		maria.peso = 55.6;
		jose.nome = "Jose";
		jose.idade = 32;
		jose.peso = 62.4;
		
	}
	
}
