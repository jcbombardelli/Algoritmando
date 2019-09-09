package algoritmando20190816;

import java.util.Scanner;

public class CalculadoraJurosYasmin {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float opcao;
		
		do {
			
			System.out.println("Inicie a calculadora \n 1 - Calculadora de Juros Simples \n 2 - Calculadora Juros Compostos");
			System.out.print("Escolha uma opção: ");
			
			
			opcao = Float.parseFloat(sc.nextLine());
			
		//Diferente de 1 e 2
		} while(opcao != 1 && opcao != 2);
		
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
			
			System.out.print("Digite o capital inicial: ");
			float capital = Float.parseFloat(sc.next());
			
			System.out.print("Digite a taxa de juros (em porcentagem): ");
			float taxa =  Float.parseFloat(sc.next()) / 100;
			
			System.out.println(taxa);
			//TODO: Perguntar se o calculo deve ser em dia, meses ou anos
			System.out.print("Digite o periodo de tempo da aplicação (em dias): ");
			float tempoDaAplicacaoEmDias =  Float.parseFloat(sc.next());
			
			
			float montante = calculoJurosCompostos(taxa, capital, tempoDaAplicacaoEmDias);

			System.out.println("O montante final da aplicação é: " + montante);
		}
		else {
			System.out.println("Opção invalida. O Programa será encerrado");
		}
	}
	
	public static float calculoJurosSimples(float taxaDeJuros, int capital, int tempo) {
		float jurosResultado = capital * taxaDeJuros * tempo;
		return jurosResultado ; 
	}
	
	
	//Implementar
	public static float calculoJurosCompostos(float capital, float taxa, float tempoDaAplicacaoEmDias) {
		//FIXME: Revisar calculo de juros compostos
		float montante = capital + (capital * (1 + taxa) * tempoDaAplicacaoEmDias);
		
		return montante;
	}

}

