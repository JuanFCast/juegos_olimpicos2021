package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import model.Country;



public class Main {
	private BufferedReader br;
	public static List<Country> country;
	public static List<Country> countriesCombined;
	
	public Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		country = new ArrayList<Country>();
		countriesCombined = new ArrayList<Country>();
	}
	
	public static void main(String [] A00372911) throws IOException {
		Main ppal = new Main();
		
		System.out.println("------------------------------------------");
		System.out.println("------WELCOME TO THE OLYMPICS GAMES-------");
		System.out.println("------------------------------------------");
		
		
		System.out.println("Introduce la cantidad de paises a evaluar ");
		System.out.print("#: ");
		int amountCountries = Integer.parseInt(ppal.readALine());
		
		System.out.println("\n--------------------------------------------------------------------------\n");
		System.out.println("------------Ingresa por favor los datos de los paises con el siguiente ejemplo-------------------"
				+ "\nNombrePais;OroMasculino;PlataMasculino;BronceMasculino;OroFemenino;PlataFemenino;BronceFemenino\n"
				+ "Es necesario que los separe por ;"
				+ "\n-------------------------------------------------------------------------------------------------");	
		
		for(int i=0; i<amountCountries;i++) {
			System.out.println("Ingresa el pais #" + (i+1) +":");
			String country = ppal.readALine();
			addCountry(country);
		}
		
		printM();
		printF();
		combineMedals();
		combineWithSelectionSort();
		combineWithInsertionSort();
		
		
	}
	
	
	public String readALine() throws IOException {
        String line = br.readLine();

        return line;
    }


	public static void addCountry(String p) {
		String[] parts = p.split(";");
		country.add(new Country( parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), Integer.parseInt(parts[4]), Integer.parseInt(parts[5]), Integer.parseInt(parts[6])));
	}
	
	private static void printM() {
		// TODO Auto-generated method stub
		
	}
	
	
	private static void printF() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	private static void combineMedals() {
		// TODO Auto-generated method stub
		
	}
	
	
	private static void combineWithSelectionSort() {
		// TODO Auto-generated method stub
		
	}
	
	
	private static void combineWithInsertionSort() {
		// TODO Auto-generated method stub
		
	}

}
