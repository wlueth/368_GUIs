package CyberPet;

import java.time.LocalDate;
import java.util.*;

public class PetStore {

	private ArrayList<CyberPet> allPets;
	
	public PetStore() {
		allPets = createPets();
	}

	public CyberPet buyLastPet() throws NoPetException{
		if(allPets.size() == 0){
			throw new NoPetException("There are currently no pets in the store.");
		}
		return allPets.remove(allPets.size()-1);
	}
	public CyberPet buyPet(String name) throws NoPetException{
		if(allPets.size() == 0){
			throw new NoPetException("There are currently no pets in the store.");
		}
		for(int i = 0; i < allPets.size(); i++){
			if(allPets.get(i).getName().equalsIgnoreCase(name)){
				return allPets.remove(i);
			}
		}
		throw new NoPetException("There are no pets in the store that have that name.");
	}
	
	public void browsePets(){
		System.out.println("Available Pets: ");
		for(int i = 0; i < allPets.size(); i++){
			System.out.println(allPets.get(i).toString());
		}
	}
	
	// New Create Method
	private static ArrayList<CyberPet> createPets() {
		ArrayList<CyberPet> temp = new ArrayList<>(25);
		
		//Populating array
		temp.add(new CyberDog("F1d0", 'M', LocalDate.now(), CyberDog.size.Medium));
		temp.add(new CyberCat("Garfield", 'M', LocalDate.now(), CyberCat.color.Striped));
		temp.add(new CyberFish("Nemo", 'M', LocalDate.now(), CyberFish.scale.Marvel));
		temp.add(new CyberDog("Patty", 'F', LocalDate.now(), CyberDog.size.Purse));
		temp.add(new CyberFish("Dory", 'F', LocalDate.now(), CyberFish.scale.Bright));
		
		return temp;
	}
	
	// public CyberPetbuyPetNamed(String name) is buyPet(String name)
	
//	private static ArrayList<CyberPet> createPets() {
//		ArrayList<CyberPet> temp = new ArrayList<>(25);
//		Random randGen = new Random();
//		
//		for(int i = 0; i < 7; i++){
//			char gender;
//			if(randGen.nextBoolean()) gender = 'M';
//			else gender = 'F';
//			temp.add(new CyberDog("F1d0 #" + i, gender, LocalDate.now(), CyberDog.size.Medium));
//			temp.add(new CyberCat("Garfield #" + i, gender, LocalDate.now(), CyberCat.color.Striped));
//			temp.add(new CyberFish("Nemo #" + i, gender, LocalDate.now(), CyberFish.scale.Marvel));
//		}
//		return temp;
//	}
}
