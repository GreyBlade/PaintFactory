package Casos;

public class CasoFinal {

	private int numCaso;
	private boolean posible;
	
	public CasoFinal(int numCaso, boolean posible){
		this.numCaso = numCaso;
		this.posible = posible;
	}

	public int getNumCaso() {
		return numCaso;
		
	}

	public void setNumCaso(int numCaso) {
		this.numCaso = numCaso;
	}

	public boolean isPosible() {
		return posible;
	}

	public void setPosible(boolean posible) {
		this.posible = posible;
	}
	
	public String toString(){
		String resultado = "Caso ";
		if (!this.posible)
			resultado += "IMPOSIBLE";
		
		else
			resultado += "POSIBLE";
		
		return resultado;
		
	}
	
}

