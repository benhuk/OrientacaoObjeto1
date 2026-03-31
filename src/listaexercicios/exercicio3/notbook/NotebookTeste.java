package listaexercicios.exercicio3.notbook;

public class NotebookTeste {
	public static void main() {
		Notebook notebook1 = new Notebook();
		notebook1.marca = "teste"; 
		notebook1.modelo = "teste 2";
		notebook1.polegadasTela = 15;
		notebook1.modeloProcessador = "tata";
		notebook1.quantidadeMemoriaRam =  1500;
		notebook1.capacidadeDeArmazenamento =  2000;
		notebook1.ligar();
		notebook1.processarinformacoes();
		notebook1.conectarinternet();
		notebook1.desligar();
		
		
	}
}
