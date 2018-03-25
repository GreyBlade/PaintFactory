package Clientes;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class ClientesTest {

	@Test
	public void CrearClientesTest() throws FileNotFoundException, IOException {
		Clientes a = new Clientes();
		ArrayList<Clientes> ListaClientes = new ArrayList<Clientes>();
		ArrayList<Integer> PinturasCliente1 = new ArrayList<Integer>();
		ArrayList<Integer> ColoresCliente1 = new ArrayList<Integer>();
		ArrayList<Integer> PinturasCliente2 = new ArrayList<Integer>();
		ArrayList<Integer> ColoresCliente2 = new ArrayList<Integer>();
		ArrayList<Integer> PinturasCliente3 = new ArrayList<Integer>();
		ArrayList<Integer> ColoresCliente3 = new ArrayList<Integer>();
		ArrayList<Integer> PinturasCliente4 = new ArrayList<Integer>();
		ArrayList<Integer> ColoresCliente4 = new ArrayList<Integer>();
		ArrayList<Integer> PinturasCliente5 = new ArrayList<Integer>();
		ArrayList<Integer> ColoresCliente5 = new ArrayList<Integer>();

		
		
		PinturasCliente1.add(1);
		ColoresCliente1.add(1);
		PinturasCliente2.add(1);
		PinturasCliente2.add(2);
		ColoresCliente2.add(0);
		ColoresCliente2.add(0);
		PinturasCliente3.add(5);
		ColoresCliente3.add(0);
		PinturasCliente4.add(1);
		ColoresCliente4.add(0);
		PinturasCliente5.add(1);
		ColoresCliente4.add(1);
		
		
		Clientes Cliente1 = new Clientes(1,PinturasCliente1,ColoresCliente1);
		Clientes Cliente2 = new Clientes(2,PinturasCliente2,ColoresCliente2);
		Clientes Cliente3 = new Clientes(1,PinturasCliente3,ColoresCliente3);
		Clientes Cliente4 = new Clientes(1,PinturasCliente4,ColoresCliente4);
		Clientes Cliente5 = new Clientes(1,PinturasCliente5,ColoresCliente5);
		
		ListaClientes.add(Cliente1);
		ListaClientes.add(Cliente2);
		ListaClientes.add(Cliente3);
		ListaClientes.add(Cliente4);
		ListaClientes.add(Cliente5);

		ArrayList<Clientes> ClientesMetodo =  new ArrayList<Clientes>();
		
		String[] b = null;
		ClientesMetodo = a.CrearClientes(b);
		
		Assert.assertEquals(ListaClientes.size(), ClientesMetodo.size());
		}

}
