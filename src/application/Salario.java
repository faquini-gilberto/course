package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Empregado1;



public class Salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado1> lista = new ArrayList<>();
		
		System.out.print("Quantos empregados serão registrados : ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Empregado #" + (i + 1));
			System.out.print("Id : ");
			int id = sc.nextInt();
			//
			// while (hasId(lista, id)) {
			// while (temId(lista, id) != -1) {
			while (temId2(lista, id) != null) {
				System.out.print("ja temos o Id. Digite outro: ");
				id = sc.nextInt();
			}
			System.out.print("Nome : ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario : ");
			double salario = sc.nextDouble();
			lista.add(new Empregado1(id, nome, salario));
			/*
			 * Empregado1 emp = new Empregado1(id, nome, salario)
			 * lista.add(emp)
			 */
		}	
			
		System.out.println();
		System.out.print("Informe o ID que tera salario aumentado : ");
		int id2 = sc.nextInt();
		/*
		Empregado1 emp = lista.stream().filter(x -> x.getId() == id2).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Empregado nao encontrado");
		}
		*/
		
		/*
		Integer pos = temId2(lista, id2);
		if (pos == null) {
			System.out.println("Empregado nao encontrado");
		}
		*/
		int pos = temId(lista, id2);
		if (pos == -1) {
			System.out.println("Empregado nao encontrado");
		}
		else {
			
			System.out.print("Informe o percentual de aumento : ");
			double percentual = sc.nextDouble();
			lista.get(pos).aumentoSalario(percentual);
			//emp.aumentoSalario(percentual);
		}
		
		System.out.println();
		System.out.println("Lista de empregados");
		for (Empregado1 objeto : lista) {
			System.out.println(objeto);
		}
		
		sc.close();
		}

	public static int temId(List<Empregado1> lista1, int id) {
		for (int i = 0; i < lista1.size(); i++) {
			if (lista1.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}
	
	public static Integer temId2(List<Empregado1> lista1, int id) {
		for (int i = 0; i < lista1.size(); i++) {
			if (lista1.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	private static boolean hasId(List<Empregado1> lista, int id) {
		Empregado1 emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
