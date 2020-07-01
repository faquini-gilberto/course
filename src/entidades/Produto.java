package entidades;

public class Produto {
	private String nome;
	private double preco;
	private int qtde;
	
	// Botão direito - Source cria automaticamente

	public Produto() {
		// construtor padrão
	}
	public Produto(String nome, double preco, int qtde) {
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		/* opcionais
		this.qtde = 0
		qtde = 0
		 */
	}

	// Getter and setters  - Botão direito Source, cria sózinho
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQtde() {
		return qtde;
	}
	public double valorTotalEstoque() {
		return preco * qtde;
	}
	
	public void adicionaQtde(int qtde) {
		this.qtde += qtde;
	}
	
	public void retiraQtde(int qtde) {
		this.qtde -= qtde;
	}
	
	public String toString() {
		return nome 
		+ ", $ " 
		+ String.format("%.2f", preco) 
		+ " , " 
		+ qtde 
		+ " unidades, Total $ " 
		+ String.format("%.2f", valorTotalEstoque());
	}
}
