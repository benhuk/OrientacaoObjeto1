package listaexercicios.exercicio6.televisao;

public class TvTeste {
	public static void main(String[] args) {
		Tv minhaTv = new Tv();
		
		minhaTv.marca = "Samsung ";
		minhaTv.polegadas = 55.0;
		minhaTv.resolucao = 4000; 
		minhaTv.canal = 1;
		minhaTv.volume = 29;
		minhaTv.ligada = false;

		minhaTv.alterarCanalParaCima(); 

		minhaTv.ligar();
		minhaTv.alterarCanalParaCima(); 
		minhaTv.alterarCanalParaCima(); 
		minhaTv.aumentarVolume();
		minhaTv.aumentarVolume(); 

		minhaTv.alterarCanalParaBaixo();
		
		System.out.println("\n--- RELATÓRIO DA TV ---");
		System.out.println(minhaTv.toString());
	}
}