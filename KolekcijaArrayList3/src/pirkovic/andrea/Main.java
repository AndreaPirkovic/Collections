package pirkovic.andrea;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// deklaracija kolekcije
		List<String>kolekcija= new ArrayList<String>();
		System.out.println("Pocetna duzina:"+ kolekcija.size());
		// size()-vraca broj elemenata smestenih u kolekciji Array
		kolekcija.add("Prvi");
		kolekcija.add("Drugi");
		kolekcija.add("Treci");
		kolekcija.add("Cetvrti");
		// add() - dodaje element na kraj kolekcije
		
		
		// prolazak kroz kolekciju
		for (String s: kolekcija)
		System.out.printf("%s ", s);
		
		System.out.println("Trenutna duzina:"+ kolekcija.size());
	// provera da li se neki zadati element nalazi unutar kolekcije
		// contains - vraca true ako kolekcija sadrzi trazeni element,
		//odnosno vraca false ukoliko kolekcija ne sadrzi trazeni element
		boolean sadrzi = kolekcija.contains("Treci"); //true ili false
		if (sadrzi) {// sadrzi== true
			System.out.println("Trazeni element se nalazi u zadatoj kolekciji");
		}
		else {
				System.out.println("Trazeni element se NE nalazi u zadatoj kolekciji");	
				}
		// get() - vraca elemet sa zadatim indeksom
		String element = kolekcija.get(2);
		System.out.println("Element sa ideksom 2 u kolekciji je : " + element);
		
		
		//indexOf- vraca indeks prve pojave zadatog elementa kolekcije
		//vratice indeks -1 ukoliko trazeni element ne postoji
		 int pozicija= kolekcija.indexOf("Drugi");
		 System.out.println("Element Drugi je na poziciji: " + pozicija);
		 //toArray-sluzi za prebacivanje elemenata iz kolekcije u niz
		 
		 String[]nizString= new String[kolekcija.size()];
		 kolekcija.toArray(nizString); // konverzija kolekcije u niz	
		 // prolazak kroz niz
		 for(String s:nizString)
			 System.out.printf("%s  ", s);
		 
		 //remove-brise prvu pojavu zadate vrednosti
		 kolekcija.remove("Treci");
		 System.out.println("Kolekcija nakon uklanjanja elementa Treci"); 
		 for(String s:kolekcija)
			 System.out.printf("%s  ", s);
		 // clear- brise sve elemente iz zadate kolekcije
		 kolekcija.clear();
		 System.out.println("velicina kolekcije nakon brisanja " +kolekcija.size());
		 
	}

}
