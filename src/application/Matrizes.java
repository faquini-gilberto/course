package application;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for (int linha=0; linha<matriz.length; linha++) {
			for (int coluna=0; coluna<matriz[linha].length; coluna++) {
				matriz[linha][coluna] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal");
		for (int linha=0; linha<matriz.length; linha++) {
			System.out.print(matriz[linha][linha] + " ");
		}
		
		System.out.println();
		
		int contador = 0;
		
		for (int linha=0; linha<matriz.length; linha++) {
			for (int coluna = 0; coluna<matriz[linha].length; coluna++) {
				if (matriz[linha][coluna] < 0) {
					contador++;
				}
			}
		}
		
		System.out.println("Qtde Numeros Impares: " + contador);
		
		
		sc.close();
	}

}
