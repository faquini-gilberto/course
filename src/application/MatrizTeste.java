package application;

import java.util.Scanner;

public class MatrizTeste {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
				
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		
		int[][] matriz = new int[linha][coluna];
		
		for (linha=0; linha<matriz.length; linha++) {
			for (coluna = 0; coluna<matriz[linha].length; coluna++) {
				matriz[linha][coluna] = sc.nextInt();
			}
		}
		
		int num = sc.nextInt();
		
		for (linha=0; linha<matriz.length; linha++) {
			for (coluna = 0; coluna<matriz[linha].length; coluna++) {
				if (matriz[linha][coluna] == num) {
					System.out.println("Posição " + linha + "," + coluna + ":");
					if (coluna != 0) {
						System.out.println("Esquerda: " + matriz[linha][coluna - 1]);
					}
					if (coluna < (matriz[linha].length - 1)) {
						System.out.println("Direita: " + matriz[linha][coluna + 1]);
					}
					if (linha != 0) {
						System.out.println("Acima: " + matriz[linha - 1][coluna]);
					}
					if (linha < (matriz.length - 1)) {
						System.out.println("Abaixo: " + matriz[linha + 1][coluna]);
					}
				}
			}
		}
		
		

	}

}
