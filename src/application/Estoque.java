package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Estoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		/* Instanciando com valores default  String null, Double 0.0, Int 0
		Produto produto = new Produto();
		System.out.println("Entre com os dados do Produto");
		System.out.print("Nome : ");
		produto.nome = sc.nextLine();
		System.out.print("Preco : ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade : ");
		produto.qtde = sc.nextInt();
		
		System.out.println();
		*/
		//System.out.println(produto.toString()); /* entidades.Produto@2ff4f00f -> antes de criar na classe */
		
		// Obrigando a informação dos dados antes de instanciar
	
		System.out.println("Entre com os dados do Produto");
		System.out.print("Nome : ");
		String nome = sc.nextLine();
		System.out.print("Preco : ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade : ");
		int qtde = sc.nextInt();
		Produto produto = new Produto(nome, preco, qtde);
		System.out.println();
		System.out.println("Produto: " + produto.toString());
		
		System.out.println();
		System.out.print("Quantidade a adicionar no estoque: ");
		qtde = sc.nextInt();
		produto.adicionaQtde(qtde);
		
		System.out.println();
		System.out.println("Dados Atualizados : " + produto.toString());
		
		System.out.println();
		System.out.print("Quantidade a ser removida do estoque : ");
		qtde = sc.nextInt();
		produto.retiraQtde(qtde);
		
		System.out.println();
		System.out.println("Dados Atualizados : " + produto);  // não precisa colocar o toString
		
		
		
		sc.close();

	}

}
