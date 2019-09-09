package algoritmando20190909;

public class Cachorro extends Animal {
	
	private	boolean temRabo;
	private boolean temCotoco;
	private int quantidadeOrelhas;
	private String cor;
	private String raca;
	private String tamanhoFucinho;
	
	
	//getters and setters
	
	public boolean getTemRabo() {
		return this.temRabo;
	}
	
	public void setCor(String novaCor) {
		this.cor = novaCor;
	}
	

	public int getQuantidadeOrelhas() {
		return this.quantidadeOrelhas;
	}

	public void setQuantidadeOrelhas(int quantidadeOrelhas) {
		this.quantidadeOrelhas = quantidadeOrelhas;
	}

	public void setRabo(boolean isRabo) {
		if(isRabo == true) {
			this.temRabo = true;
			this.temCotoco = false;
		}
		else {
			this.temRabo = false;
			this.temCotoco = true;
		}
	}
	
	

	public void latir() {
		
		System.out.println("Cachorro latindo");
		cocar();
		
	}
	
	public void farejar() {
		
	}
	
	private void cocar() {
		
		System.out.println("Cachorro se coçando");
		
	}

}
