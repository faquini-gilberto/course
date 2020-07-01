package application;

import java.util.Locale;
import java.util.Scanner;

import utilitarios.Calculadora;



public class Estatico {

	// public static double PI = 3.14;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o raio: ");
		double raio = sc.nextDouble();
		
		/* com funções estáticas dentro da classe
		double c = circunferencia(raio); 
		double v = volume(raio);         */ 
		
		/* Com uma classe externa (public)
		 * 
		 Tem que instanciar o objeto
		Calculadora calc = new Calculadora();
		double c = calc.circunferencia(raio);
		double v = calc.volume(raio);
		*/
		
		/* Com uma classe externa (static)
		 * 
		 */
		double c = Calculadora.circunferencia(raio);
		double v = Calculadora.volume(raio);
		System.out.printf("Circunferencia = %.2f%n", c);
		System.out.printf("Volume = %.2f%n", v);
		//System.out.printf("Valor de PI = %.2f%n", calc.PI); funções dentro da classe
		// System.out.printf("Valor de PI = %.2f%n", calc.PI); classe externa
		System.out.printf("Valor de PI = %.2f%n", Calculadora.PI);
		sc.close();
	}	

	/*
	 * Funções estáticas dentro da classe
	 
	public static double circunferencia(double raio) {
		return 2 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4 * PI * Math.pow(raio, 3) / 3.0;
	}
	*/

}
