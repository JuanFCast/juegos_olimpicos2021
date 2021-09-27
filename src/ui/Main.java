package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Country;
import model.CountryMedals;


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
	
	
	public static void sortByComparator(){
		Comparator<Country> c1 = new CountryMedals();
		
		Collections.sort(country, c1);
		
	}
	
	public static void combineMedals() {
		for(int i=0; i < country.size(); i++) {
			countriesCombined.add(new Country(country.get(i).getName(), (country.get(i).getmGoldMedal()+country.get(i).getfGoldMedal()), (country.get(i).getmSilverMedal()+country.get(i).getfSilverMedal()), (country.get(i).getmBronzeMedal()+country.get(i).getfBronzeMedal())));
		}
	}
	
	
	
	
public static void selectSort() {
		
		int pos =0;
		while(pos < countriesCombined.size()) {
			Country max= countriesCombined.get(pos);
			for(int i=pos; i<countriesCombined.size(); i++) {

				if(countriesCombined.get(i).getcombinedGoldMedal()>max.getcombinedGoldMedal()) {
					Country temp = countriesCombined.get(i);
					countriesCombined.set(i, max);
					max = temp;
				}
			}
			countriesCombined.set(pos, max);
			pos++;
		}
		
	}
	
	public static void insertionSort() {

		int j;
		Country sentinel;
		for (int i=1; i<countriesCombined.size(); i++) {
			sentinel = countriesCombined.get(i);
			j = i-1;
			while((j>=0) && (sentinel.getcombinedGoldMedal()>countriesCombined.get(j).getcombinedGoldMedal())) {
				countriesCombined.set(j+1, countriesCombined.get(j));
				j--;
			}
			countriesCombined.set(j+1, sentinel);
		}

	}
	
	
	public static void printM() {
		System.out.println("Masculino");
		sortByComparator();
		for(int i=0; i<country.size(); i++) {
			System.out.println(country.get(i).getName()+" "+country.get(i).getmGoldMedal()+" "+country.get(i).getmSilverMedal()+" "+country.get(i).getmBronzeMedal());
		}
		System.out.println("----------");
	}
	
	
	public static void printF() {
		Collections.sort(country);
		System.out.println("Femenino");
		for(int i=0; i<country.size(); i++) {
			System.out.println(country.get(i).getName()+" "+country.get(i).getfGoldMedal()+" "+country.get(i).getfSilverMedal()+" "+country.get(i).getfBronzeMedal());
		}
		System.out.println("----------");
		
	}
	

	
	
	public static void combineWithSelectionSort() {
		System.out.println("Combinado por SelectionSort");
		selectSort();
		for(int i=0; i<countriesCombined.size(); i++) {
			System.out.println(countriesCombined.get(i).getName()+" "+countriesCombined.get(i).getcombinedGoldMedal()+" "+countriesCombined.get(i).getcombinedSilverMedal()+" "+countriesCombined.get(i).getcombinedBronzeMedal());
		}
		System.out.println("----------");
	}
	
	public static void combineWithInsertionSort() {
		System.out.println("Combinado por InsertionSort");
		insertionSort();
		for(int i=0; i<countriesCombined.size(); i++) {
			System.out.println(countriesCombined.get(i).getName()+" "+countriesCombined.get(i).getcombinedGoldMedal()+" "+countriesCombined.get(i).getcombinedSilverMedal()+" "+countriesCombined.get(i).getcombinedBronzeMedal());
		}
	}

}
