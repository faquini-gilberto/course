package application;

import java.util.Locale;
import java.util.Scanner;

import utilitarios.CoversorMoeda;

public class Ex04moeda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		
		
		System.out.print("Qual o valor do Dolar? ");
		double dolar = sc.nextDouble();
		System.out.print("Quantos dolares serao comprados? ");
		double qtde = sc.nextDouble();
		
		System.out.printf("Valor a ser pago em reais = %.2f%n", CoversorMoeda.calculador(dolar, qtde));
				
		sc.close();
	}

}
