package utilitarios;

public class CoversorMoeda {

	public static double IOF = 0.06;
	
	public static double calculador(double valor, double qtde) {
		return (valor * qtde) * (1.0 + IOF);
	}
		 
}
