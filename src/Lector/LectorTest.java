package Lector;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class LectorTest {

	@Test
	public void LeerporCaracter() throws FileNotFoundException {
		//Arrenge
		Lector a = new Lector();
		String[] arrayCorrecto = {"2","5","3","1","1","1","2","1","0","1","0","1","5","0","1","2","1","1","0","1","1","1","4","3","1","1","0","1","2","0","1","3","0"};
		
		//Act
		String[] arrayMetodo = a.LeerArchivo();
		
		//Assert
		Assert.assertArrayEquals(arrayCorrecto, arrayMetodo);
		
		
	}
	
	@Test
	public void LineaporLineaTest() throws FileNotFoundException, IOException{
		Lector a = new Lector();
		
		String[] arrayCorrecto = {"2","5","3","1 1 1","2 1 0 1 0","1 5 0","1","2","1 1 0","1 1 1","4","3","1 1 0","1 2 0","1 3 0"};
		String[] arrayEsperado = a.LeerLineaPorLinea();
		
		Assert.assertArrayEquals(arrayCorrecto, arrayEsperado);
	}

}
