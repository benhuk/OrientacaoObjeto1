package listaexercicios05.exercicio01;

import java.util.List;
import java.util.ArrayList;
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
public class Banco {
	private List<Conta> contas;
	public Banco() {
		this.contas = new ArrayList<Conta>();
	}
	public void criarNovaConta(int numero, int cpf, String nomeCliente) {
		this.contas.add(new Conta(numero, new Cliente(cpf, nomeCliente)));
		System.out.println("Conta" + numero + "cadastrada com sucesso!");
	}
	public void realizarSaque(int numeroConta,double valor) {
		for(Conta conta : contas) {
			
			if(conta.getNumero() == numeroConta) {
				
				conta.realizarSaque(valor);
				return;
			}
		}
		System.out.println("Conta inexistente.");
	}
	public void realizarDeposito(int numeroConta, double valor) {
		for(Conta conta : contas) {
			if(conta.getNumero() == numeroConta) {
				conta.realizarDeposito(valor);
				return;
			}
		}
		System.out.println("Conta inexistente.");
	}
	public void verificarSaldo(int numeroConta) {
		for(Conta conta : contas) {
			if(conta.getNumero() == numeroConta) {
				conta.verificarSaldo();
				return;
			}
			
		}
		System.out.println("Conta inexistente.");
	}
}
