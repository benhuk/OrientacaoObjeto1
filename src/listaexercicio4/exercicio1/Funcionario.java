package listaexercicio4.exercicio1;

public class Funcionario {
	private int numeroRegistro;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String setor;
	private String telefone;
	private Endereco enderecos; 
	public Funcionario(int numeroRegistro, String nome, String dataNascimento, String sexo, 
            String setor, String telefone, String logradouro, int num, 
            String bairro, String cidade, String uf) {
			this.numeroRegistro = numeroRegistro;
			this.nome = nome;
			this.dataNascimento = dataNascimento;
			this.sexo = sexo;
			this.setor = setor;
			this.telefone = telefone;
			this.enderecos = new Endereco(logradouro, num, bairro, cidade, uf);
}
	public void emitirRelatorio() {
		System.out.println("\nnumero Registro:" + numeroRegistro
				+ "\nnome:" + nome + "\ndata Nascimento:" + dataNascimento
				+ "\nsexo:"+ sexo + "\nsetor:" + setor + "\ntelefone:" + telefone
				+ "\nlogradouro:" + enderecos.getLogradouro() + "numero:" + enderecos.getNumero()
				+ "\nbairro: " + enderecos.getBairro() + "\ncidade:" + enderecos.getCidade() 
				+ "\nUF:" + enderecos.getUnidadeFederativa());
	}
}
