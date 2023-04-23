import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		String imena[]= {"Mika","Zika","Ana","Lana","Hana","Una"};
		List<String>listaImena= new ArrayList<String>();
		
		for(String ime: imena)
			listaImena.add(ime);
		String imenaZaBrisanje[]= {"Mika","Lana","Hana"};
		List<String>listaImenaZaBrisanje= new ArrayList<String>();
		for(String ime:imenaZaBrisanje)
			listaImenaZaBrisanje.add(ime);
		// kreiranje iteratora kolekcije i stampanje liste pomocu iteratora
		// zaobilazenje elemenata kolekcije
		Iterator<String> iter=listaImena.iterator();
		System.out.println("Stampanje elemenata pomocu iteratora");;
		while(iter.hasNext())
			System.out.print(iter.next() + " ");
			
		
		//Brisanje elemenata liste imena koja se nalaze u listi
		// koja se zove listaImenaZaBrisanje
		iter= listaImena.iterator();
		
		while(iter.hasNext())
			
			if(listaImenaZaBrisanje.contains(iter.next()))// utvrdjujemo da li lista imena a brisanje
				//sadrzi element na koji ukazuje iterator
				//ako je odgovor true brisemo element
				iter.remove();
		
		
		System.out.println("Lista nakon brisanja:");
		for(int i=0; i<listaImena.size();i++)
			System.out.println(listaImena.get(i) + " ");
			
	}

}
