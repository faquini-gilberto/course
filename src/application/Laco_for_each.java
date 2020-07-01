package application;

public class Laco_for_each {

	public static void main(String[] args) {
		String[] vetor = new String[] {"Joao", "Maria", "Antonio"};
	
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		for (String objeto : vetor) {
			System.out.println(objeto);
		}
	} 
	

}
