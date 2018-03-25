package AnalizadorCasos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import Casos.CasoFinal;
import Casos.Casos;
import Clientes.Clientes;

public class AnalizadorCasos {
	private ArrayList<Casos> Casos;


	/*	public CasoFinal(int numCaso, boolean posible){
		this.num= numCaso;
		this.posible = posible;
	}*/

	public AnalizadorCasos(){}

	public ArrayList<Casos> getCasos() throws IOException{
		Casos cas = new Casos();
		String[] ar=null;
		ArrayList<Casos> ListaDeCasos = new ArrayList<Casos>();
		ListaDeCasos = cas.CrearCasos(ar);
		this.Casos = ListaDeCasos;
		return ListaDeCasos;
	}


	public ArrayList<CasoFinal> AnalizarCasos() throws IOException{
		Casos cas = new Casos();
		ArrayList<Casos> ListaDeCasos = new ArrayList<Casos>();
		String respuesta = "";
		String[] ar=null;
		ArrayList<CasoFinal> resultado = new ArrayList<CasoFinal>();
		ListaDeCasos = cas.CrearCasos(ar);
		ArrayList<Integer> pinturas = new ArrayList<Integer>();
		for (int i=0; i<ListaDeCasos.size();i++){
			if (ListaDeCasos.get(i).getClien().size()>ListaDeCasos.get(i).getNumPint()){
				CasoFinal c1 = new CasoFinal(i, false);
				resultado.add(c1);
			}
			else{
				CasoFinal c1 = new CasoFinal(i, true);
				ArrayList<Integer> test = new ArrayList<Integer>();
				for (int j=0;j<ListaDeCasos.get(i).getClien().size(); j++){
					for (int k=0; k<ListaDeCasos.get(i).getClien().get(j).getPintura().size();k++){
						if (test.contains(ListaDeCasos.get(i).getClien().get(j).getPintura().get(k))){
						int num=	ListaDeCasos.get(i).getClien().get(j).getNumPinturas();
						ListaDeCasos.get(i).getClien().get(j).setNumPinturas(num-1);

						}
						else{
							test.add(ListaDeCasos.get(i).getClien().get(j).getPintura().get(k));
						}


					}

				}
				int numClientes =ListaDeCasos.get(i).getClien().size();
				for (int j=0;j<ListaDeCasos.get(i).getClien().size(); j++){
					if (ListaDeCasos.get(i).getClien().get(j).getNumPinturas()==0){
						numClientes= numClientes-1;
					}
				}
				
				if (numClientes<ListaDeCasos.get(i).getClien().size()){
					c1.setPosible(false);
				}
				resultado.add(c1);

			}
		}
		return resultado;

	}
}



