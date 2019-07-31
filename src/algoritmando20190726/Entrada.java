package algoritmando20190726;
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		//Captura entrada do console (Exclusivo deo Java)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o operador matematico");
		String operador = sc.next();
	
		System.out.print("Digite o primeiro numero: ");
		int b1 = Integer.parseInt(sc.next());
		
		System.out.print("Digite o segundo numero: ");
		int b2 = Integer.parseInt(sc.next());
		
		
		if(operador == "+") {
			
			int resultado = somaDeDoisInteiros(b1, b2);
			System.out.println("O resultado da soma é: " + resultado);
		}
		else if(operador == "*") {
			
			int resultado = multiplicacaoDeDoisInteiros(b1, b2);
			System.out.println("O resultado da multiplicacao é: " + resultado);
			
		}
		else if(operador == "/") {
			
			int resultado = divisaoDeDoisInteiros(b1, b2);
			System.out.println("O resultado da divisao é: " + resultado);
			
		} else {
			
			int resultado = subtracaoDeDoisInteiros(b1, b2);
			System.out.println("O resultado da subtracao é: " + resultado);
		}
				
		
	}
	
	public static int somaDeDoisInteiros(int a, int b) {
		int resultado = a + b;
		return resultado;	
	}
	
	public static int subtracaoDeDoisInteiros(int a, int b) {
		int resultado = a - b;
		return resultado;
	}
	
	public static int divisaoDeDoisInteiros(int a, int b) {
		int resultado = a / b;
		return resultado;
	}
	
	public static int multiplicacaoDeDoisInteiros(int a, int b) {
		int resultado = a * b;
		return resultado;
	}

}
