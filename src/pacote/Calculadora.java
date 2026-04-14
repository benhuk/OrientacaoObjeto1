package pacote;
/*Desenvolva um sistema de calculadora. Cada calculadora é identificada por sua marca,
modelo, tipo (básica, financeira, científica, etc.) e memória interna (em megabytes), que
devem ser inicializados no momento de sua criação (método construtor). Uma vez iniciado os
atributos, os mesmos não poderão ser alterados, ou seja, não podem possuir os métodos
setters. Além disso, uma calculadora que seja capaz de realizar as quatro operações básicas:
soma, subtração, multiplicação e divisão. Para testá-la, utilize uma classe de teste e, ao
invocar os métodos da calculadora, passe por parâmetro dois valores para realizar os
cálculos.*/
public class Calculadora {
	private String marca;
	private String modelo;
	private String tipo;
	private int memoriaInterna;
	
	public Calculadora(String marca, String modelo, String tipo, int memoriaInterna) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.memoriaInterna = memoriaInterna;
		
	}
	public void somar(int x, int y) {
		System.out.println("a soma é: " + (x+y));
	}
	public void subtrair(int x, int y) {
		System.out.println("a subtrair: " + (x-y));
	}
		
	public void dividir(int x, int y) {
			if(y==0) {
				System.out.println("a divisao nao pode ser por 0");
			}else {
				System.out.println("a divisao é:" + (x/y));
			}
	}
	public void multiplicar(int x, int y) {
		System.out.println("a multiplicacao: " + (x*y));
	}
	public String toString() {
		return "marca:" + marca + "modelo: " + modelo + "tipo: " + tipo +  "memoria Interna: " + memoriaInterna;
	}
}
