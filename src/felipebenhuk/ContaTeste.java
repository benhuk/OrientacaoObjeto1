package felipebenhuk;

public class ContaTeste {
	public void main(String [] args) {
		Conta felipe = new Conta(555, 123, 0);
		felipe.depositar(500);
		felipe.sacar(600);
		felipe.verificar();
	}
}
