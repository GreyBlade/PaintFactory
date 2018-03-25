package Casos;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import AnalizadorCasos.AnalizadorCasos;
import junit.framework.Assert;

public class CasosTest {

	@Test
	public void CrearCasosTest() throws IOException {
		
		Casos a = new Casos();
		String[] ar = null;
		ArrayList<Casos> casos = new ArrayList<Casos>();
		casos = a.CrearCasos(ar);
		Assert.assertEquals(3, casos.size());
	}
	

	
/*	@Test
	public void AnalizadorPaint() throws IOException{
		AnalizadorCasos an = new AnalizadorCasos();
		an.getCasos();
		
		Assert.assertEquals(6, an.AnalizadorPinturas().size());
	}
*/
	
	

	
	
}
