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
public class BancoTeste {
	public static void main(String[] args) {
		
		Banco banco = new Banco();
		
		banco.criarNovaConta(111, 123456, "José da Silva");
		banco.criarNovaConta(222, 987654, "Maria de Oliveira");
		banco.criarNovaConta(333, 159483, "Ricardo Carvalho");
		
		banco.verificarSaldo(222);
		
		banco.realizarDeposito(222, 100.00);
		banco.verificarSaldo(222);
		
		banco.realizarSaque(222, 100.00);
		banco.verificarSaldo(222);
	}
}