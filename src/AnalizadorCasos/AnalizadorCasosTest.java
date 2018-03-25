package AnalizadorCasos;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import Casos.CasoFinal;
import Casos.Casos;
import junit.framework.Assert;

public class AnalizadorCasosTest {

	@Test
	public void AnalizadorTest() throws IOException{
		AnalizadorCasos an = new AnalizadorCasos();
		ArrayList<CasoFinal> result = new ArrayList<CasoFinal>();
		
		result = an.AnalizarCasos();
		
		
		for (int i=0; i<result.size(); i++){
			System.out.println(result.get(i).toString());

		}
		Assert.assertFalse("Incorrecto", result.get(0).isPosible());
		Assert.assertFalse("Incorrecto", result.get(1).isPosible());
		Assert.assertTrue("Incorrecto", result.get(2).isPosible());


	}
	
	@Test
	public void getCasosTest() throws IOException{
		AnalizadorCasos an = new AnalizadorCasos();
		ArrayList<Casos> result = new ArrayList<Casos>();
		result = an.getCasos();
		
		Assert.assertEquals(3, result.size());
		
	}
}
