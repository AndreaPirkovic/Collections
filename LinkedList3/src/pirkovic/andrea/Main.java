package pirkovic.andrea;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		List<String>LList= new LinkedList<String>();
		LList.add("1");// bez obzora sto unosimo cifru ili znak, sve sto je pod navodnicima je String tipa
		LList.add("2");
		LList.add("3");
		LList.add("4");
		LList.add("5");
		
		System.out.println("Kretanje kroz listu od prvog do poslednjeg elementa");
		ListIterator itr= LList.listIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ " ");
		}
		System.out.println("Kretanje kroz istu od poslednjeg do prvog elementa");
		while(itr.hasPrevious())
		{
			System.out.print(itr.previous()+ " ");
		}
	
	}

}
