package algoritmando20190729;

import java.util.Scanner;

public class Exercicio {
	
	public static void main(String[] args) {
		//Captura entrada do console (Exclusivo deo Java)
		Scanner sc = new Scanner(System.in);

		String operador = "";
		boolean bandeirinha = false;
		
		
		//Complete com a condicional necessária para sair deste laço
		//quando o usuario digitar o seu nome e seu email

		do {

			System.out.print("Digite seu nome: ");
			String nome = sc.nextLine();

			System.out.print("Digite seu email: ");
			String email = sc.nextLine();

			if(nome.length() > 1 && email.length() > 1)
				bandeirinha = true;	

		} while (_____________________);


		while(operador != "sair") {
			

			System.out.print("Digite o operador matematico: ");
			operador = sc.next();

			System.out.print("Digite o primeiro numero: ");
			int b1 = Integer.parseInt(sc.next());

			System.out.print("Digite o segundo numero: ");
			int b2 = Integer.parseInt(sc.next());

			int resultado;
			
			//Identifique a condiçao que fará o switch não ser chamado
			if(_______________) {

				// O que será testado dentro deste switch ?
				//Alias, complete todos os casos possiveis
				switch (_____) {
				case "+":
					System.out.println("____________________" + );
					break;
				case "-":
					break;
				case "*":
					break;
				case "/":
					break;
				default:
					System.out.println("Você não selecionou uma opção valida");
					break;
				}
				
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
