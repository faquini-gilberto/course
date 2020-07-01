package entidades;

public class Aluno {
	public String nome;
	public double trim1;
	public double trim2;
	public double trim3;
	
	public double calcMedia() {
		return trim1 + trim2 + trim3;
	}
	
	public String toString() {
		double media = calcMedia();
		if (media >= 60.0) {
			return "Media Final = "
					+ String.format("%.2f", media)
					+ "\n"
					+"Aprovado";
		}
		else {
			return "Media Final = "
					+ String.format("%.2f", media)
					+ "\n"
					+ "Reprovado"
					+ "\n"
					+ "Faltou(aram) "
					+ String.format("%.2f", (60.0 - media))
					+ " pontos";
		}
	}
}
