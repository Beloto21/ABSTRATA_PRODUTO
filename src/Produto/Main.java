package Produto;

public class Main {
	
    public static void main(String[] args) {
    	
    	// teste da classe "Produto"
    	Produto produto = new Produto("Garrafa", 4.0, 9.0);
    	
    	// chamando o metodo 
    	produto.salvar();
        System.out.println("Lucro da garrafa: " + produto.calcularLucro());
    	
        // teste da classe 
        ProdutoAlimenticio produtoAlimento = new ProdutoAlimenticio("Batata", 17.0, 21.0, "21/10/2024", "Possui bastante vitamina C");
        
        // chamando o metodo 
        produtoAlimento.salvar();
        System.out.println("Lucro da batata: " + produtoAlimento.calcularLucro());

        // teste da classe 
        ProdutoVestuario produtoVestuario = new ProdutoVestuario("Tenis", 40.0, 90.0, "43", "Branco", "Couro");
        
        // chamando o metodo 
        produtoVestuario.salvar();
        System.out.println("Lucro do tenis: " + produtoVestuario.calcularLucro());      
    }
}