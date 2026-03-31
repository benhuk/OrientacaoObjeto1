package listaexercicios.exercicio6.televisao;
/*


Para o volume, o valor mínimo e máximo é 0 e 30, respectivamente. Ao chegar no mínimo, o
valor deve permanecer em 0 e, ao chegar no máximo, deve permanecer em 30. Além disso,
deve ser possível exibir um relatório contendo todos os dados da TV por meio do método
toString( ), como marca, polegadas, resolução, canal que está sintonizada e volume atual do
som. Para efetuar a instanciação da televisão, definição dos valores de seus atributos e
invocação de métodos, utilize uma classe de teste
 */
public class Tv {
	String marca;
	double polegadas;
	int resolucao;
	
	boolean ligada;
	int canal;
	int volume;
	public void ligar() {
		ligada = true;
		System.out.println(marca +"está ligada!");
	}
	public void desligar() {
		ligada = false;
		System.out.println(marca + "está desligada!");
	}
	
	public void alterarCanalParaCima() {
		if(ligada) {
			canal = canal +1;
			if(canal > 99) {
				canal = 1;
				
			}
			System.out.println(marca + " - Canal:" +canal);
		}
	}
	public void alterarCanalParaBaixo() {
		if(ligada) {
			canal = canal -1;
			if(canal < 1) {
				canal = 99;
				
			}
			System.out.println(marca + " - Canal:" +canal);
		}
	}
	public void aumentarVolume() {
		if(ligada) {
			volume = volume +1;
			if(volume > 30) {
				volume = 30;
				
			}
			System.out.println(marca + " - Volume:" +volume);
		}
	}
	public void abaixarVolume() {
		if(ligada) {
			volume = volume -1;
			if(volume < 0) {
				volume = 0;
				
			}
			System.out.println(marca + " - Volume:" +volume);
		}
	}
	@Override
	public String toString() {
		return "Televisao [marca=" + marca + ", polegadas=" + polegadas + ", resolucao=" + resolucao + ", ligada="
				+ ligada + ", canal=" + canal + ", volume=" + volume + "]";
	}
}
