package entidades;

public class Empregado {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void novoSalario(double porc) {
		salarioBruto += (salarioBruto * porc / 100);
	}
	
	public String toString() {
		return nome
		+ ", $ "
		+ String.format("%.2f", salarioLiquido());
	}
}
