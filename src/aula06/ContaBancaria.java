package aula06;
/*Um conta bancária é identificada pelo seu número da
conta, nome do titular e saldo.
Sabendo que o número de conta não pode ter o
mesmo número de outra, desenvolva um sistema que,
ao instanciar uma nova conta, verifique quantas
contas já existem e atribua o número seguinte a nova
conta.
*/
public class ContaBancaria {
	static int contadorDeContas = 0;
	int numeroDaConta;
	String nome;
	double saldo;
	public void novaConta() {
		contadorDeContas++;
		numeroDaConta = contadorDeContas;
	}
}
