package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * p = (A + B + C) / 2 area = Raiz_quadrada p * (p - A) * (p - B) * (p - C)
		 */

		/*
		 * 
		 * Sem Orientação a Objeto
		 * 
		 * double xA, xB, xC, yA, yB, yC; double p, areaX, areaY;
		 * 
		 * System.out.println("Entre com os lados do Triangulo X: "); 
		 * xA = sc.nextDouble(); 
		 * xB = sc.nextDouble(); 
		 * xC = sc.nextDouble();
		 * System.out.println("Entre com os lados do Triangulo Y: "); 
		 * yA = sc.nextDouble(); 
		 * yB = sc.nextDouble(); 
		 * yC = sc.nextDouble();
		 * 
		 * p = (xA + xB + xC)/ 2; 
		 * areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		 * 
		 * p = (yA + yB + yC) / 2; 
		 * areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		 * 
		 */

		/*
		 * Com Orientação
		 */

		double p, areaX, areaY;

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com os lados do Triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com os lados do Triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		/*
		 * Repetindo formulas 
		
		p = (x.a + x.b + x.c)/ 2; 
		areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2; 
		areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		*/
		
		/* 
		 * Criando Metodo para calcular area na classe Triangulo
		 */
		areaX = x.area();
		areaY = y.area();
		System.out.printf("Area do Triangulo X: %.5f%n", areaX);
		System.out.printf("Area do Triangulo Y: %.5f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Area X eh maior");
		} else {
			System.out.println("Area Y eh maior");
		}
		sc.close();
	}

}
