package listaexercicios.exercicio1.carro;

public class CarroTeste {
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		
		carro1.modelo = "Teste";
		carro1.marca = "Honda";
		carro1.cor = "rosa";
		carro1.ano = 2026;
		carro1.renavam = "abc1234";
		carro1.chassi = "56483";
		carro1.placa = "abc1234";
		carro1.ligar();
		carro1.acelerar();
		carro1.frear();
		carro1.desligar();
	}

}
