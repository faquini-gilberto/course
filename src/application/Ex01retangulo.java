package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Ex01retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a largura e altura do Retangulo :");
		
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERIMETRO = %.2f%n", retangulo.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
		sc.close();
	}

}
