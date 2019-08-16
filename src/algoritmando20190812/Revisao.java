package algoritmando20190812;

import java.util.Scanner;

public class Revisao {

	public static void main(String args[]) {
		
		int resultado = -1;
		Scanner sc = new Scanner(System.in);
		
		while(resultado <= 0) {
			
			System.out.print("Digite um numero: ");
			String entradaA = sc.nextLine();
			int entradaAconvertida = Integer.parseInt(entradaA);
			
			System.out.print("Digite outro numero: ");
			int entradaB = Integer.parseInt(sc.nextLine());
			
			resultado = somaDeDoisInteiros(entradaAconvertida, entradaB);
			System.out.println("O Resultado da soma é: " + resultado);
		
		}
		
		
		
		
		
//		if(resultado >= 0) {
//			System.out.println("O Resultado é positivo");
//		}
//		else {
//			System.out.println("O Resultado é negativo");
//		}
		
		
		
		
		
	}

	//Modificador de acesso
	//Retorno do meu metodo
	//nome do meu metodo
	public static int somaDeDoisInteiros(int valorA, int valorB) {
		int resultAB = valorA + valorB;	
		return resultAB;
	}
}
