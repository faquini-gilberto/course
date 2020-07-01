package entidades;

public class Conta {
	private int conta;
	private String nome;
	private double saldo;

	public Conta() {
	}

	public Conta(int conta, String nome, double valor) {
		this.conta = conta;
		this.nome = nome;
		deposito(valor);
	}

	public Conta(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		this.saldo += valor;
	}

	public void retirada(double valor) {
		saldo -= (valor + 5.00);
	}

	@Override
	public String toString() {
		return "Conta " 
	+ conta 
	+ ", Nome: " 
	+ nome 
	+ ", Saldo: $" 
	+ saldo;
	}

}
