package listaexercicios05.exercicio01;
/*Desenvolva um sistema bancário. O banco possui diversas contas. Cada conta é identificada por seu
número correspondente e seu saldo. Além disso, a conta contém um cliente titular que é identificado
por seu nome e CPF. Neste sistema o banco pode criar novas contas que deverão ser armazenadas.
Para isto, é necessário receber o número da nova conta, nome e cpf do titular. Para cada nova conta
criada, o saldo será 0 (zero) reais.
Além disso, por intermédio do banco é possível realizar saques, depósitos e verificação de saldo em
contas específicas. Para realizar o saque é necessário enviar ao método o número da conta e o valor
a ser sacado. O sistema deve então localizar a conta desejada e o saque só ser efetivado se o saldo
da conta for suficiente, ou seja, ao efetuar o saque o saldo não pode ficar negativo.
Para efetuar um depósito, se deve ter conhecimento do número da conta e o valor a ser depositado na
conta. O sistema deve encontrar a conta requerida e então o valor será somado ao saldo atual da conta.
Para realizar a verificação de saldo, deve ter conhecimento do número da conta, o método deve buscar
a conta correta e imprimir em tela os dados da conta, como número, nome e cpf do titular, e saldo da
conta. Os dados da conta devem ser impressos sem a utilização do método toString( ).
Para realizar a inicialização do banco, criar contas, fazer saques, depósitos e verificação de saldo,
utilize uma classe de testes.*/
public class Conta {
	private int numero;
	private double saldo;
	
	private Cliente cliente;
	
	public Conta(int numero, Cliente cliente) {
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = 0;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void realizarSaque(double valor) {
		if(this.saldo > valor) {
			this.saldo -= valor;
			System.out.println("Saldo realizado com sucesso!");
			System.out.println("================");
		}else {
			System.out.println("Saldo insuficiente.");
			System.out.println("================");
		}
	}

	public void realizarDeposito(double valor) {
		if(valor <=0) {
			System.out.println("nao e possivel adicionar 0 ou valores negativos");
			System.out.println("================");
		}else {
			this.saldo += valor;
			System.out.println("saldo adicionado!");
			System.out.println("================");
		}

	}
	
	public void verificarSaldo() {
		System.out.println("============================");
		System.out.println("Número da Conta: " + this.numero);
		System.out.println("CPF do Titular: " + this.cliente.getCpf());
		System.out.println("Nome do Titular: " + this.cliente.getNome());
		System.out.println("Saldo: R$" + this.saldo);
		System.out.println("============================");
	}
}
