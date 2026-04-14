package pacote;
/*
  Uma empresa precisa automatizar o processo de cadastro de seus funcionários. Sabe-se que
um funcionário possui seu número de registro, nome completo, data de nascimento, sexo,
setor em que trabalha, telefone e endereço. O endereço é formado pelo nome da rua, número,
bairro, cidade e estado. Todos os dados devem ser inicializados pelo método construtor e
podem ser obtidos e por meio métodos de acesso (getters). Entretanto, apenas o setor e o
telefone podem ser alterados por meio dos métodos de acesso (setters). Além disso, deve
ser possível emitir um relatório com os dados do funcionário. Utilize uma classe de teste para
instanciar os funcionários, bem como atribuir valores aos seus dados e invocar os métodos
a fim de testá-los.
 */

public class Funcionario {

	private int numeroRegistro;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String setor;
	private String telefone;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Funcionario(int numeroRegistro, String nome, String dataNascimento, String sexo, String setor,
			String telefone, String rua, int numero, String bairro, String cidade, String estado) {
		
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public String getNome() {
		return nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public String getRua() {
		return rua;
	}

	public int getNumero() {
		return numero;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return "Funcionario [numeroRegistro=" + numeroRegistro + ", nome=" + nome + ", dataNascimento=" + dataNascimento
				+ ", sexo=" + sexo + ", setor=" + setor + ", telefone=" + telefone + ", rua=" + rua + ", numero="
				+ numero + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + "]";
	}
}