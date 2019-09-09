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
	
	//Metodo de ação
	public void amamentar() {
		
		if(sexo == true) {
			//Então é uma femea
			System.out.println("amamentando");
		}
		else {
			System.out.println("Esse animal não é uma femea");
		}
	}
	
	
	//Metodo Construtor
	public Animal() {
		this.sexo = true;
	}

}
