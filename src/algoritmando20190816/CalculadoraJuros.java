package algoritmando20190816;

import java.util.Scanner;

public class CalculadoraJuros {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Inicie a calculadora \n 1 - Calculadora de Juros Simples "
				+ "\n 2 - Calculadora Juros Compostos");
		System.out.print("Escolha uma opção: ");
	
		int opcao = Integer.parseInt(scanner.nextLine());
		
		if (opcao == 1) {
			
			System.out.print("Digite a taxa de juros: ");
			float taxaDeJuros = Float.parseFloat(sc.nextLine());
			
			//Alterar para ponto flutuante
			System.out.print("Digite o capital: ");
			int capital = Integer.parseInt(sc.nextLine());
			
			System.out.print("Digite o tempo (em dias): ");	
			int tempo = Integer.parseInt(sc.nextLine());
			float jurosResultado = calculoJurosSimples(taxaDeJuros, capital, tempo);
			
			System.out.println("O total de juros em reais é de: R$"+jurosResultado);
			System.out.println("O total de capital é de R$:"+ (jurosResultado + capital)  );
				
		}
		else if (opcao == 2) {
			
		}
	}
	
	public static float calculoJurosSimples(float taxaDeJuros, int capital, int tempo) {
		float jurosResultado = capital * taxaDeJuros * tempo;
		return jurosResultado;
	}
//	
//	
//	//Implementar
//	public static float calculoJurosCompostos() {
//		
//		return 0;
//	}

}
