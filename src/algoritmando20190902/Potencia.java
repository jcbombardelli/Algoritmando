package algoritmando20190902;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		//Captura entrada do console (Exclusivo deo Java)
		Scanner sc = new Scanner(System.in);

	
		System.out.print("Digite a base: ");
		int b1 = Integer.parseInt(sc.next());
		
		System.out.print("Digite o expoente: ");
		int b2 = Integer.parseInt(sc.next());
		
		double resultado = potenciacao(b1, b2);
		System.out.println("O Resultado é: " + resultado);
		
	}

	
	public static double potenciacao(int base, int expoente) {
		
		// multiplicar a base por ela mesma por N vezes, sendo N igual ao expoente
		double acumulador = base;
		
		for (int repete = 1; repete < expoente ; repete++) {			
			acumulador = acumulador * base;
		}
		
		if(expoente == 0) {
			return 1;
		}
		
		return acumulador;	
	}
}
