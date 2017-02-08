package CyberPet;

import java.time.LocalDate;
import java.time.Month;

public class PetTester {

	CyberPet myPet, myPet2, myPet3;
	CyberDog dog;
	CyberCat cat;
	CyberFish fish;
	Owner own1, own2, own3, own4;
	PetStore store;
	
	public PetTester() {
		myPet = new CyberDog("F1d0", 'M', LocalDate.of(1994, Month.MAY, 24), PetState.RELAXING, 8, 8, 5, 9, CyberDog.size.Child_Eater);
		myPet2 = new CyberCat("Buster", 'F', LocalDate.of(1999, Month.APRIL, 8), PetState.THINKING, 5, 2, 8, 19, CyberCat.color.Striped);
		myPet3 = new CyberFish("Squishy", 'M', LocalDate.of(2005, Month.DECEMBER, 31), CyberFish.scale.Dull);
		
		dog = new CyberDog("Billy", 'F', LocalDate.of(1950, Month.DECEMBER, 18), PetState.DEAD, 10, 5, 6, 0, CyberDog.size.Medium);
		cat = new CyberCat("Bob", 'M', LocalDate.of(1992, Month.MAY, 30), PetState.EATING, 4, 2, 12, 3, CyberCat.color.Brown);
		fish = new CyberFish("Dory", 'M', LocalDate.of(1860, Month.JANUARY, 1), PetState.DEAD, 0 , 0, 0, 0, CyberFish.scale.Rainbow);
		
		own1 = new Owner("Owner1", myPet);
		own2 = new Owner("Owner2", myPet2);
		own3 = new Owner("Owner3", myPet3);
		own4 = new Owner("Owner4", dog);
		store = new PetStore();
	}
	public static void main(String[] args) {
		PetTester tester = new PetTester();
		tester.runTest1();
	}
	
	private void runTest1() {
		try{
			store.browsePets();
			own1.setPet(store.buyPet("F1d0 #3"));
			own2.setPet(store.buyLastPet());
			
			System.out.println(own1);
			System.out.println();
			System.out.println(own2);
			System.out.println();
			
			own1.pet.eat();
			own1.pet.sleep();
			own1.pet.move();
			System.out.println();
			
			dog.bark();
			cat.purr();
			fish.spray();
		} catch(NoPetException e){
			e.printStackTrace();
		}
	}
}
