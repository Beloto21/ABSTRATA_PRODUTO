package Produto;

// classe Produto
public class Produto {
	
	// atributos da classe 
    private String nome;
    private double precoCusto;
    private double precoVenda;

    // construtor da classe 
    public Produto(String nome, double precoCusto, double precoVenda) {
    	
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    // funcao que calcula o Lucro 
    public double calcularLucro() {
    	
        return precoVenda - precoCusto;
    }

    // metodo para salvar 
    public void salvar() {
    	
        System.out.println("Produto ja foi salvo: " + nome);
    }

    // metodo para deletar 
    public void deletar() {
    	
        System.out.println("Produto ja foi deletado: " + nome);
    }
    
    // metodo para atualizar 
    public void atualizar() {
    	
        System.out.println("Produto ja foi atualizado: " + nome);
    }

    // metodos getters e setters
    public String getNome() {
    	
        return nome;
    }

    public void setNome(String nome) {
    	
        this.nome = nome;
    }

    public double getPrecoCusto() {
    	
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
    	
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
    	
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
    	
        this.precoVenda = precoVenda;
    }
}