package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta conta11;

		System.out.print("Entre o numero da conta: ");
		int conta = sc.nextInt();
		System.out.print("Informe o nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		// Conta conta1 = new Conta(conta, nome);
		System.out.print("Existe deposito inicial (s/n): ");
		/*
		 * String sn = sc.next(); 
		 * if (sn.equals("s")) { 
		 * //if (sn.charAt(0) != 'n') {
		 * System.out.print("Informe o valor do deposito inicial: "); 
		 * double valor =
		 * sc.nextDouble(); 
		 * conta1.soma(valor); }
		 */
		char sn = sc.nextLine().charAt(0);
		if (sn == 's') {
			System.out.print("Informe o valor do deposito inicial: ");
			double valorInicial = sc.nextDouble();
			conta11 = new Conta(conta, nome, valorInicial);
		} else {
			conta11 = new Conta(conta, nome);
		}
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta11.toString());
		System.out.println();

		System.out.print("Informe o valor do deposito:");
		double valor = sc.nextDouble();
		conta11.deposito(valor);
		System.out.println("Dados Atualizados");
		System.out.println(conta11.toString());
		System.out.println();

		System.out.print("Informe o valor da retirada:");
		valor = sc.nextDouble();

		conta11.retirada(valor);
		System.out.println("Dados Atualizados");
		System.out.println(conta11.toString());
		System.out.println();

		sc.close();
	}

}
