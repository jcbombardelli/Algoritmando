package algoritmando20190729;

import java.util.Scanner;

public class Resposta {

	public static void main(String[] args) {
		//Captura entrada do console (Exclusivo deo Java)
		Scanner sc = new Scanner(System.in);

		String operador = "";
		boolean bandeirinha = false;

		do {

			System.out.print("Digite seu nome: ");
			String nome = sc.nextLine();

			System.out.print("Digite seu email: ");
			String email = sc.nextLine();

			if(nome.length() > 1 && email.length() > 1)
				bandeirinha = true;	

		} while (bandeirinha == false);


		while(operador != "sair") {
			

			System.out.print("Digite o operador matematico: ");
			operador = sc.next();

			System.out.print("Digite o primeiro numero: ");
			int b1 = Integer.parseInt(sc.next());

			System.out.print("Digite o segundo numero: ");
			int b2 = Integer.parseInt(sc.next());

			int resultado;

			if(operador != "sair") {

				switch (operador) {
				case "+":
					resultado = somaDeDoisInteiros(b1, b2);
					System.out.println("O resultado da soma é: " + resultado);
					break;
				case "-":
					resultado = subtracaoDeDoisInteiros(b1, b2);
					System.out.println("O resultado da subração é: " + resultado);
					break;
				case "x":
				case "*":
					resultado = multiplicacaoDeDoisInteiros(b1, b2);
					System.out.println("O resultado da multiplicação é: " + resultado);
					break;
				case "/":
					resultado = divisaoDeDoisInteiros(b1, b2);
					System.out.println("O resultado da divisão é: " + resultado);
					break;
				default:
					System.out.println("Você não selecionou uma opção valida");
					break;
				}
				
			} else {
				System.exit(0);
			}
			
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
