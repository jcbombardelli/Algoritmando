package algoritmando20190722;

public class Variaveis {

	public static void main(String[] args) {

		String atlas;
		atlas = "Hello Atlas!";

		int numero = 7;
		int dez = 10;
		float reais = 2.50f;
		boolean ehPositivo = false;
		char operacao = '+';

		System.out.println(numero + dez);
		System.out.println(reais);
		System.out.println(reais + numero);
		System.out.println(atlas + reais);
		System.out.println(!ehPositivo);

		int resultadoDaSoma = somaDeDoisInteiros(numero, dez);
		System.out.println(resultadoDaSoma);		
	}
	
	public static int somaDeDoisInteiros(int a, int b) {

		int resultado = a + b;
		return resultado;

	}
}
