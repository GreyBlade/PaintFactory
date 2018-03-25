package Lector;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lector {
	private static String  path = "assets/input.txt";
	
	
	public String[] LeerArchivo() throws FileNotFoundException{
		String[] input =null ;
		Scanner scan = new Scanner(new File(this.path));
		List<String> temporal = new ArrayList<String>();
		
		while (scan.hasNext()){
			String a = scan.next();
			temporal.add(a);
		}
		scan.close();
		
		input = temporal.toArray(new String[0]);
		
		return input;
	}
	
	public String[] LeerLineaPorLinea() throws FileNotFoundException, IOException{
		String[] texto = null;
		List<String> temporal = new ArrayList<String>();

		try(BufferedReader br = new BufferedReader(new FileReader(this.path))){
			for (String line;(line = br.readLine())!=null;){
				temporal.add(line);
			}
		}
		texto = temporal.toArray(new String[0]);
		
		return texto;
	}
}
