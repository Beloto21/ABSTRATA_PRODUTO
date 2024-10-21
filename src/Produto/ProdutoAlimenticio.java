package Produto;

// classe ProdutoAlimenticio com herança de uma outra classe "Produto"
public class ProdutoAlimenticio extends Produto {
	
	// atributos da classe 
    private String dataValidade;
    private String informacoesNutricionais;

    // construtor da classe 
    public ProdutoAlimenticio(String nome, double precoCusto, double precoVenda, String dataValidade, String informacoesNutricionais) {
        super(nome, precoCusto, precoVenda);
        this.dataValidade = dataValidade;
        this.informacoesNutricionais = informacoesNutricionais;
    }

    // metodos para salvar 
    @Override
    public void salvar() {
    	
        System.out.println("Produto alimentício ja foi salvo: " + getNome());
    }

 // metodos para deletar 
    @Override
    public void deletar() {
    	
        System.out.println("Produto alimentício ja foi deletado: " + getNome());
    }

 // metodos para atualizar 
    @Override
    public void atualizar() {
        System.out.println("Produto alimentício ja foi atualizado: " + getNome());
    }

    // metodos getters e setters
    public String getDataValidade() {
    	
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
    	
        this.dataValidade = dataValidade;
    }

    public String getInformacoesNutricionais() {
    	
        return informacoesNutricionais;
    }

    public void setInformacoesNutricionais(String informacoesNutricionais) {
    	
        this.informacoesNutricionais = informacoesNutricionais;
    }
}