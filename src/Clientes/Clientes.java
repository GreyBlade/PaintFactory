package Clientes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import Lector.Lector;

public class Clientes {
	private int NumPinturas;
	private ArrayList<Integer> Pintura;
	private ArrayList<Integer> Color;
	private Lector a = new Lector();

	
	public Clientes(int NumPinturas, ArrayList<Integer>Pintura, ArrayList<Integer> Color){
		this.NumPinturas = NumPinturas;
		this.Pintura = Pintura;
		this.Color = Color;
	}
	public Clientes(){}

	public int getNumPinturas() {
		return NumPinturas;
	}

	public void setNumPinturas(int numPinturas) {
		NumPinturas = numPinturas;
	}
	
	public ArrayList<Integer> getPintura() {
		return Pintura;
	}

	public void setPintura(ArrayList<Integer> pintura) {
		Pintura = pintura;
	}

	public ArrayList<Integer> getColor() {
		return Color;
	}

	public void setColor(ArrayList<Integer> color) {
		Color = color;
	}
	
	public ArrayList<Clientes> CrearClientes(String[] ar) throws FileNotFoundException, IOException{
		ArrayList<Clientes> clientes = new ArrayList<Clientes>();
		ar = a.LeerLineaPorLinea();
		String regex = "^\\d\\s\\d\\s\\d$";
		String regex1 = "^\\d\\s\\d\\s\\d\\s\\d\\s\\d$";

		for (int i=0; i<ar.length; i++){
			
			if (ar[i].matches(regex)||ar[i].matches(regex1)){
				String[] lineasClientes = ar[i].split("\\s+");
				
				ArrayList<Integer> pinturas = new ArrayList<Integer>();
				ArrayList<Integer> colores = new ArrayList<Integer>();
				for (int j=0; j<lineasClientes.length; j++){
					
					if (j!=0 && j%2!=0){
						pinturas.add(Integer.parseInt(lineasClientes[j]));
					}
					else if (j!=0 && j%2==0){
						colores.add(Integer.parseInt(lineasClientes[j]));

					}
					if (j==lineasClientes.length-1){
						Clientes a = new Clientes();
						a.setNumPinturas(Integer.parseInt(lineasClientes[0]));
						a.setPintura(pinturas);
						a.setColor(colores);
						clientes.add(a);

					}

				}
				
				
			}
		}
		
		
		
		
		return clientes;
	}

}
