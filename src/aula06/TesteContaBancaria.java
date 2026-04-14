package aula06;

public class TesteContaBancaria {
	public static void main(String [] args) {
		ContaBancaria conta1 = new ContaBancaria();
		ContaBancaria conta2 = new ContaBancaria();
		conta1.novaConta();
		conta1.nome = "pedrinho";
		conta1.saldo = 5000;
		conta2.novaConta();
		conta2.nome = "pedrinhin";
		conta2.saldo = 10000;
		System.out.println("Nome:" + conta1.nome + "\nNumero da conta:" + conta1.numeroDaConta + "\nsaldo:" + conta1.saldo);
		System.out.println("Nome:" + conta2.nome + "\nNumero da conta:" + conta2.numeroDaConta + "\nsaldo:" + conta2.saldo);
	}
}
