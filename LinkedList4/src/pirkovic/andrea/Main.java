package pirkovic.andrea;

public class Main {

	public static void main(String[] args) {
		
		//TestiraBroj paranBroj= /* ovde dolazi lambda izraz*/
			// leva strana lambda izraza(gde se pisu parametri u zagradi ako ih ima)->desna strana lambda izraza (tu se pise fukncionalnost)
		
	//	() -> 123.45
	//	double nekaMetoda(); {return 123.45;}
		TestiraBroj paranBroj = (n) -> (n%2)==0;
		if (paranBroj.test(12)) {
			
		
		System.out.println("Broj je paran broj.");
		}
		else {
			System.out.println("Broj nije paran!");
		}
	}

}
