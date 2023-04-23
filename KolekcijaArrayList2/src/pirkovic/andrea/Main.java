package pirkovic.andrea;

public class Main {

	public static void main(String[] args) {

		int[] niz= {2,5,7,9,29};
		//stampanje elementa niza 
		System.out.println("Stampanje elemenata niza for petljom:");
		for (int i=0;i<niz.length;i++) {
			System.out.println(niz[i]);
			
			
		}
		System.out.println("\nStampanje elemenata unapredjenom for petljom:");
		
		for (int i: niz)// unapredjena for petlja
			System.out.println(i);
		
	}

}
