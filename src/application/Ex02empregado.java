package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Empregado;

public class Ex02empregado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Empregado empregado = new Empregado();
		
		System.out.print("Nome : ");
		empregado.nome = sc.nextLine();
		System.out.print("Salario : ");
		empregado.salarioBruto = sc.nextDouble();
		System.out.print("Imposto : ");
		empregado.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: " + empregado.toString());
		
		System.out.println();
		System.out.print("Qual o percentual de aumento? ");
		empregado.novoSalario(sc.nextDouble());
		
		System.out.println();
		System.out.println("Dados Atualizados: " + empregado.toString());
		
		sc.close();
	}

}
