package exemplo1;

public class Pessoa {
	private String nome;
	private String data;
	private String sexo;
	private String email;
	private Endereco endereco;
	public void imprimirDados() {
		System.out.println("nome:" +this.nome + " data:" + this.data + " sexo:" + this.sexo + " email:" + this.email + " endereco:" + this.endereco);
		System.out.println("Logradouro:" + this.endereco.getLogradouro());
		System.out.println("numero:" + this.endereco.getLogradouro());
		System.out.println("bairro:" + this.endereco.getLogradouro());
		System.out.println("cidade:" + this.endereco.getLogradouro());
		System.out.println("UF:" + this.endereco.getLogradouro());
	}
}
