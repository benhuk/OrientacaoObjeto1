package aula3;
/*Desenvolva um sistema de calculadora. Cada calculadora é identificada por sua marca,
modelo, tipo e memória interna. Além disso, cada calculadora pode ligar, desligar, realizar os
cálculos de soma, subtração, multiplicação e divisão. Para instanciar e atribuir os valores para
cada calculadora, declare uma classe de teste*/
public class TesteCalculadora {
	public static void main(String [] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.marca = "Nike";
		calculadora.modelo = "Teste";
		calculadora.tipo = "Calcula";
		calculadora.memoriaInterna = 5000;
		
		calculadora.ligar();
		
		System.out.println(calculadora.marca + "\n" + calculadora.modelo + "\n" +
		calculadora.tipo + "\n" + calculadora.memoriaInterna + "\n" + "A soma e:" +
		calculadora.soma(5, 5) + "\nA subtracao e:" + calculadora.subtracao(10, 5)+
		"\nA multiplicacao e:" + calculadora.multiplicacao(5, 5) + "\nA divisao e:" +
		calculadora.divisao(10, 5));
		
		calculadora.desligar();
	}
}
