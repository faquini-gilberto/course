package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Alugado;

public class Aluguel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Alugado[] quarto = new Alugado[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int q = sc.nextInt();
		
		
		for (int i = 0; i<q; i++) {
			sc.nextLine();
			System.out.print("Nome : ");
			String nome = sc.nextLine();
			System.out.print("Email : ");
			String email = sc.nextLine();
			System.out.print("Quarto : ");
			int numquarto = sc.nextInt();
			quarto[numquarto] = new Alugado(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados");
		for (int i = 0; i<quarto.length; i++) {
			if (quarto[i] != null) {
				//System.out.printf("%f:  quarto[i].toString", i);
				//System.out.println("Email : " + quarto[i].getEmail());
				System.out.println(i + " " + quarto[i]);
				System.out.print(i);
				System.out.print(quarto[i] + "\n");
			}
		}
		
		sc.close();
	}

}
