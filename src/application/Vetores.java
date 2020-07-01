package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto2;

public class Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		int n = sc.nextInt();
		// Criação do vetor
		double[] vetor = new double[n];
		
		for (int i = 0; i<n; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}

		double media = 0.0;
		
		media = soma / n;
		
		System.out.printf("Media de Altura %.2f%n", media);
	}
		*/
		
		// Instanciando Objetos em uma classe
		
		int n = sc.nextInt();
		
		Produto2[] vetor = new Produto2[n];
		
		for (int i = 0; i<vetor.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new Produto2(nome, preco);
		}
		
		double soma = 0.0;
		
		for (int i = 0; i<vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		
		double media = 0.0;
		
		media = soma / vetor.length;
		
		System.out.printf("Media de Preco : %.2f%n", media);
		sc.close();
	}
}
