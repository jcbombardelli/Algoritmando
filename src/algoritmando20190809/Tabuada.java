package algoritmando20190809;

import java.util.Scanner;

public class Tabuada {
	
	public static int contador = 100; 

	// Tabuada do 5
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o multiplicador: ");
		int multiplicador = Integer.parseInt(scanner.next());
		
//		int multiplicador = 11;		
//		int contador = 1;
		
//		while(contador <= 10) {
//			int resultadoDaMultiplicacao = contador * multiplicador;
//			
//			System.out.println("O resultado de " + multiplicador + " x " 
//						+ contador + " é igual à: " + resultadoDaMultiplicacao);
//			contador++;
//		}
		
		int contador = 100;
		String nome = "";
				
		
		for(contador = 1; contador <= 10; contador++) {
			int resultadoDaMultiplicacao = contador * multiplicador;
			System.out.println("O resultado de " + multiplicador + " x " 
					+ contador + " é igual à: " + resultadoDaMultiplicacao);			
		}
		
		System.out.println("Quanto valerá o contador ?" + contador);
		
		
		
		
		
		
		
		

	}

}
