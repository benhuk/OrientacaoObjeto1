package pacote;

public class FuncionarioTeste {
	public static void main(String [] args) {
		Funcionario funcionario1 = new Funcionario(123456, 
				   "João da Silva", 
				   "01/01/2001", 
				   "Masculino", 
				   "Financeiro", 
				   "42-999-888-777", 
				   "Vicente Machado", 
				   1024, 
				   "Centro", 
				   "Ponta Grossa", 
				   "PR");
		System.out.println(funcionario1);
		funcionario1.setSetor("tenis");
		System.out.println(funcionario1);
		funcionario1.setTelefone("4445");
		System.out.println(funcionario1);
	}
}
