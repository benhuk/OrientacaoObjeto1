package felipebenhuk;
/*Um banco deseja automatizar o processo nas contas de seus clientes. Sabendo que uma
conta é formada por um número da agência, número da conta e saldo, e devem ser
inicializados no momento da criação da conta (método construtor). Desenvolva um sistema
para realizar as transações de saque, depósito e verificação de saldo em uma determinada
conta. Para realizar um saque é necessário saber o valor que se deseja sacar, ou seja, o
método sacar necessita do parâmetro valor. O saque só pode ocorrer se o valor a ser sacado
não exceder o valor que há de saldo. Em outras palavras, o saldo da conta não poderá ficar
negativo. Para a realização do depósito também é necessário saber o valor a ser depositado.
Logo, este valor deve ser passado por parâmetro para o método. Este valor é então
incrementado ao saldo atual da conta. Por fim, o método de verificação de saldo apresenta
todos os dados da conta. O saldo da conta só poderá ser alterado por meio dos métodos de
saque e depósito. Os demais atributos não poderão ser alterados após sua inicialização. Para
realizar os testes necessário, uma classe de testes deve ser implementada.*/
public class Conta {
	private int numeroAgencia;
	private int numeroConta;
	private double saldo;
	public Conta(int numeroAgencia,int numeroConta, double saldo) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	public void sacar(double valor) {
		if(this.saldo < valor) {
			System.out.print("nao pode");
		}else {
			this.saldo = this.saldo - valor;
			System.out.print("ta liberado chef" + this.saldo);
		}
		
	}
	public void depositar(double valor) {
		this.saldo = valor + this.saldo;
	}
	public void verificar() {
		System.out.print(this.numeroAgencia + this.numeroConta +this.saldo);
	}
}
