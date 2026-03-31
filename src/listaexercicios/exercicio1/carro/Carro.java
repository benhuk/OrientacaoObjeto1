/*1. Desenvolva um sistema para controlar um carro. Sabe-se que o carro é identificado pelo seu
modelo, marca, cor, ano, renavam, chassi e placa. Além disso, o carro pode ligar, desligar,
acelerar e frear. Ao invocar os métodos do carro, o mesmo deverá exibir o que está ocorrendo,
como por exemplo, ao invocar o método ligar, deve-se exibir uma mensagem: “<modelo do
carro> está ligando”. Ao ser invocado o método acelerar, deve exibir: “<modelo do carro> está
acelerando”, e assim por diante. Utilize uma classe de teste para instanciar vários carros,
atribuir seus respectivos valores e invocar os métodos de cada um.*/
package listaexercicios.exercicio1.carro;

public class Carro {
	String modelo;
	String marca;
	String cor;
	int ano;
	String renavam;
	String chassi;
	String placa;
	void ligar() {
		System.out.println(modelo + " está ligando");
	}
	void desligar() {
		System.out.println(modelo + " está desligado");	
	}
	void acelerar() {
		System.out.println(modelo + " está acelerando");
	}
	void frear() {
		System.out.println(modelo + " está freando");
	}
}
