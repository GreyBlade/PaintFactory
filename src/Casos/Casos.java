package Casos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import Clientes.Clientes;
import Lector.Lector;

public class Casos {
	private int NumCaso;
	private Lector a = new Lector();
	private Clientes cli = new Clientes();
	private int NumPint;
	private ArrayList<Clientes> clien;
	
	public Casos(int id,int NumPinturas, ArrayList<Clientes> clientes){
		this.NumCaso = id;
		this.NumPint = NumPinturas;
		this.clien = clientes;
	}
	public Casos(){}
	
	public int getNumPint() {
		return NumPint;
	}
	public void setNumPint(int numPint) {
		NumPint = numPint;
	}
	public ArrayList<Clientes> getClien() {
		return clien;
	}
	public void setClien(ArrayList<Clientes> clien) {
		this.clien = clien;
	}
	public ArrayList<Casos> CrearCasos(String[] array) throws IOException{
		array = a.LeerLineaPorLinea();
		ArrayList<Casos> Casos = new ArrayList<Casos>();
		ArrayList<Clientes> clientes = new ArrayList<Clientes>();
		clientes = cli.CrearClientes(array);
		
		int NumCasos =0;
		//Regex para 3 numeros
		String regex = "^\\d\\s\\d\\s\\d$";
		//Reegex para 5 numeros
		String regex1 = "^\\d\\s\\d\\s\\d\\s\\d\\s\\d$";
		//Regex para solo 1 numero
		String regex2 = "^\\d";
		
		//Iteramos el array del .txt
		for (int i=0; i<array.length;i++){
			
			
			//Inicio de los casos
			//Si en una posicion del array esta solamente un numero
			//Y la siguiente posicion tiene 3 o 5
			//Iniciamos un caos
			if ( (array[i].matches(regex2)) && ( (array[i+1].matches(regex)) || (array[i+1].matches(regex1)) ) ){
				//El numero de clientes siempre sera el inicio del caso
				NumCasos++;
				int NumClientes = Integer.parseInt(array[i]);
				//Numero de pinturas sera una posicion atras del numero de clientes
				int NumPinturas = Integer.parseInt(array[i-1]);
				
				//Nos creamos un arrayList que guardara los clientes para cada caso
				ArrayList<Clientes> ClientesParaCasos = new ArrayList<Clientes>();
				
				//Iteramos el arrayList que contiene todos los clientes
				for (int j=0;j<NumClientes; j++){
					//Y los agregamos a nuestro ArrayList para cada caso
					ClientesParaCasos.add(clientes.get(j));
				}
				//Luego los eliminamos
				for (int j=0;j<NumClientes; j++){
					clientes.remove(0);
				}
				//Nos creamos un caso, con el numero de pinturas y el arrayList de clientes
				Casos caso = new Casos(i,NumPinturas, ClientesParaCasos);
				//Y lo agregamos al hashmap
				Casos.add(caso);
				
			}
			
		}
	
		
		return Casos;
	}
	
	

}
