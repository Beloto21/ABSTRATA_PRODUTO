package Produto;

// classe ProdutoVestuario com heranca de uma outra classe "Produto"
public class ProdutoVestuario extends Produto {
	
	// atributos da classe 
    private String tamanho;
    private String cor;
    private String material;

    // construtor da classe 
    public ProdutoVestuario(String nome, double precoCusto, double precoVenda, String tamanho, String cor, String material) {
        super(nome, precoCusto, precoVenda);
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }

    // metodo para salvar 
    @Override
    public void salvar() {
    	
        System.out.println("Produto do vestuário ja salvo: " + getNome());
    }
    
    // metodo para deletar 
    @Override
    public void deletar() {
    	
        System.out.println("Produto do vestuário ja deletado: " + getNome());
    }

    // metodo para atualizar 
    @Override
    public void atualizar() {
    	
        System.out.println("Produto do vestuário ja atualizado: " + getNome());
    }

    // metodos getters e setters
    public String getTamanho() {
    	
        return tamanho;
    }

    public void setTamanho(String tamanho) {
    	
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
    	
        this.material = material;
    }
}