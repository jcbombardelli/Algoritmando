package algoritmando20190909;

public class Animal {
	
	//Mamiferos
	
	//Macho = falso e Femea = true;
	//Propriedade
	private boolean sexo;
	
	
	//Metodo de acesso
	public boolean getSexo() {
		return sexo;
	}
	
	//Metodo de a��o
	public void amamentar() {
		
		if(sexo == true) {
			//Ent�o � uma femea
			System.out.println("amamentando");
		}
		else {
			System.out.println("Esse animal n�o � uma femea");
		}
	}
	
	
	//Metodo Construtor
	public Animal() {
		this.sexo = true;
	}

}
