package algoritmando20190826;

public class Pilha {
	
	
	//Estrutura de dados mais simples
	
	public static int max = 10;
	public static int[] numerosInteiros = new int[max];
	public static int indice = -1;
	
	//push - insere um valor no topo da pilha
	//pop - remove o valor topo da pilha
	//top - exibe o valor do topo pilha
	//all - exibe todos os itens da pilha até o indice
	//allValues - exibe todos os itens da pilha
	
	//problemas com GarbageCollector
		// - Stop The World
	
	public static void push(int value) {
		indice++;
		numerosInteiros[indice] = value;
	}
	
	public static void pop() {
		indice--;	
	}
	
	public static void top() {
		System.out.println(numerosInteiros[indice]);
	}
	
	public static void all() {
		
		for(int i = 0; i <= indice; i++) {
			System.out.println(numerosInteiros[i]);
		}	
	}
	
	public static void allValues() {		
		for(int i = 0; i < max; i++) {
			System.out.println(numerosInteiros[i]);
		}	
	}

	
	public static void garbageCollector() {
		for(int g = 0; g < max; g++) {
			if(g >= indice) {
				numerosInteiros[g] = 0;
			}
		}
	}
		
	public static void main(String[] args) {
		
		//DEsenvolva um sistema onde o usuario poderá inserir, remover ou exibir o topo da pilha quantas
		//vezes ele quiser até que ele decida sair do sistema
		
		push(10);
		push(4);
		push(3);
		push(15);
		push(42);
		push(30);
		//System.out.println("-------------------------");
		pop();
		push(8);
		all();
		System.out.println("-------------------------");
		top();

	}
 
}
