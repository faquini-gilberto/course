package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Ex03aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		System.out.print("Nome do Aluno: ");
		aluno.nome = sc.nextLine();
		System.out.print("Nota Primeiro Trimestre: ");
		aluno.trim1 = sc.nextDouble();
		System.out.print("Nota Segundo Trimestre: ");
		aluno.trim2 = sc.nextDouble();
		System.out.print("Nota Terceiro Trimestre: ");
		aluno.trim3 = sc.nextDouble();
		
		System.out.println(aluno);
		
		sc.close();
	}

}
