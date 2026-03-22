/*Desenvolva um sistema de calculadora. Cada calculadora é identificada por sua marca,
modelo, tipo e memória interna. Além disso, cada calculadora pode ligar, desligar, realizar os
cálculos de soma, subtração, multiplicação e divisão. Para instanciar e atribuir os valores para
cada calculadora, declare uma classe de teste*/
package aula3;

public class Calculadora {
	String marca;
	String modelo;
	String tipo;
	int memoriaInterna;
	
	
	void ligar() {
		System.out.println("Calculadora ligada.");
	}
	void desligar() {
		System.out.println("Calculadora desligada.");
	}
	int soma(int a, int b) {
		return a+b;
	}
	int subtracao(int a, int b) {
		return a-b;
	}
	double multiplicacao(int a,int b) {
		return a*b;
	}
	double divisao(int a,int b) {
		return (double)a/b;
	}
}
