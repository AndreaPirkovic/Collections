import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String>ll= new LinkedList<String>();
		// dodavanje elemenata u povezanoj listi
		ll.add("A");
		ll.add("B");
		
		ll.add(2, "C");
		System.out.println("Elementi povezane liste su:" + ll);
		
		//Brisanjeelementa iz povezane lsite
		ll.remove(0);// brisanje preko indeksa
		ll.remove("B");// brisanje preko vrednosti
		System.out.println("Povezana lista nakon brisanja elemenata" + ll);
		
		
		ll.add("D");
		ll.add("E");
		ll.add("F");
		
		System.out.println("Elemeni povezane liste su " + ll);
		boolean sadrzi= ll.contains("E");
		if (sadrzi=true) {
			System.out.println("Lista sadrzi element E.");}
	else {
		
		System.out.println("Lista ne sadrzi element E.");
	}
	
	// pristupanje (uzimanje) vrednosti elementa iz povezane liste
		
		Object element =ll.get(3);//uzimanje indeksa 2
		System.out.println("Zatrazen element je: " + element);
		ll.set(1,"Z");
		System.out.println("Povezana lista nakon promene:" + ll);
	// Unutar interfejsa List, indeksiranje ide od 0. ne moze
		//se indeksirati stringovnim tipom
	
	
	}

}
