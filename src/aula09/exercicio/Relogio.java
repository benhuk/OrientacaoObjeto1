package aula09.exercicio;
/*
Implemente a classe Relogio. Esta classe possui três atributos: marca
(String), hora (int) e minutos (int). A classe Relogio possui um método
construtor que recebe três variáveis: marca, hora e minuto, que são
responsáveis pela inicialização dos atributos de instância. Além disso,
declare os métodos getters e setters para os atributos, porém sabe-se
que a marca do relógio não pode ser alterada. Nos métodos setters
devem haver algumas restrições para realizar a atribuição.
• hora deve ser um valor entre 0 e 23;
• minuto deve ser um valor entre 0 e 59;
• Implemente uma classe RelogioTeste para poder instanciar a classe
Relogio e invocar os métodos dos objetos instanciados
 * */
public class Relogio {
	private String marca;
	private int hora;
	private int minuto;
	public Relogio(String marca, int hora, int minuto) {
		this.marca = marca;
		setHora(hora);
		setMinuto(minuto);
	}
	public String getMarca() {
		return marca;
	}

	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		if(hora >= 0 && hora <= 23) {
			this.hora = hora;	
		}else {
			System.out.println("horário inválido");
		}
		
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public void setMinuto(int minuto) {
		if(minuto >= 0 && minuto <= 59) {
			this.minuto  = minuto;	
		}
		
	}
	
}
