package aula09.exercicio;
/*
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




public class RelogioTeste {
    public static void main(String[] args) {
        
        System.out.println("=== TESTANDO RELÓGIO ===\n");
        
        // 1. Testando construtor com valores válidos
        System.out.println("1. Criando relógio com valores válidos:");
        Relogio relogio1 = new Relogio("Casio", 14, 30);
        System.out.println("Marca: " + relogio1.getMarca());
        System.out.println("Hora: " + relogio1.getHora());
        System.out.println("Minuto: " + relogio1.getMinuto());
        
        System.out.println("\n2. Testando construtor com valores inválidos:");
        // Testando hora inválida (25)
        Relogio relogio2 = new Relogio("Technos", 25, 45);
        System.out.println("Após tentar criar com hora 25:");
        System.out.println("Hora ficou: " + relogio2.getHora());
        
        // Testando minuto inválido (70)
        Relogio relogio3 = new Relogio("Pulsar", 10, 70);
        System.out.println("Após tentar criar com minuto 70:");
        System.out.println("Minuto ficou: " + relogio3.getMinuto());
        
        System.out.println("\n3. Testando setters com valores válidos:");
        Relogio relogio4 = new Relogio("Seiko", 15, 21);
        System.out.println("Valores iniciais: " + relogio4.getHora() + ":" + relogio4.getMinuto());
        
        relogio4.setHora(23);
        relogio4.setMinuto(59);
        System.out.println("Após setar 23:59: " + relogio4.getHora() + ":" + relogio4.getMinuto());
        
        System.out.println("\n4. Testando setters com valores inválidos:");
        relogio4.setHora(24);  // Inválido
        relogio4.setMinuto(60); // Inválido
        System.out.println("Após tentar setar 24:60: " + relogio4.getHora() + ":" + relogio4.getMinuto());
        
        System.out.println("\n5. Testando limites:");
        Relogio relogio5 = new Relogio("LimitTest", 0, 0);
        System.out.println("Mínimo (0:0): " + relogio5.getHora() + ":" + relogio5.getMinuto());
        
        relogio5.setHora(23);
        relogio5.setMinuto(59);
        System.out.println("Máximo (23:59): " + relogio5.getHora() + ":" + relogio5.getMinuto());
        
        System.out.println("\n6. Verificando que a marca não pode ser alterada:");
        System.out.println("Marca original: " + relogio1.getMarca());
        // relogio1.setMarca("Outra"); // Isso daria erro de compilação - o método não existe!
        System.out.println("Não existe método setMarca() - a marca é imutável ✓");
    }
}