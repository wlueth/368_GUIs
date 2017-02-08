package CyberPet;

import java.util.ArrayList;
import java.util.Scanner;

public class PetGame {
	private ArrayList<Owner> allOwners;
	private PetStore store;
	private Owner user;
	
	public PetGame(){
		allOwners = new ArrayList<Owner>(10);
		store = new PetStore();
		//TODO: Code this
	}
	public static void main(String[] args) {
		PetGame game = new PetGame();
		game.run();
	}

	public void run() {
		setUpUser();
		selectPet();
		interactWithPet();
		
	}
	private void interactWithPet() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int choice;
		String prompt = "What would you like to do today?\n" +
				"1. Put pet to bed\n" +
				"2. Ask pet a question\n" +
				"3. Play with pet\n" +
				"4. Feed pet\n" +
				"5. Excercise\n" +
				"6. Let pet relax\n" +
				"7. Show Health\n" +
				"8. Stop playing";

		do {
			System.out.println(prompt);
			choice = sc. nextInt();

			switch(choice){
				case 1:
					user.pet.setState(PetState.SLEEPING);
					user.pet.getHealth().setTiredness(-4);
					user.pet.getHealth().setEnergy(4);
					break;
				case 2:
					user.pet.setState(PetState.THINKING);
					user.pet.getHealth().setHunger(1);
					user.pet.getHealth().setLoneliness(-3);
					user.pet.getHealth().setEnergy(-2);
					break;
				case 3:
					user.pet.setState(PetState.PLAYING);
					user.pet.getHealth().setEnergy(-3);
					user.pet.getHealth().setLoneliness(-3);
					user.pet.getHealth().setTiredness(4);
					user.pet.getHealth().setHunger(3);
					break;
				case 4:
					user.pet.setState(PetState.EATING);
					user.pet.getHealth().setHunger(-5);
					user.pet.getHealth().setEnergy(1);
					break;
				case 5:
					user.pet.setState(PetState.MOVING);
					user.pet.getHealth().setEnergy(-2);
					user.pet.getHealth().setHunger(2);
					user.pet.getHealth().setTiredness(3);
					user.pet.getHealth().setLoneliness(-4);
					break;
				case 6:
					user.pet.setState(PetState.RELAXING);
					user.pet.getHealth().setTiredness(-2);
					user.pet.getHealth().setEnergy(2);
					break;
				case 7:
					System.out.println(user.pet.getHealth());
					System.out.println(user.pet.getHealth().getHealthLevels());
					break;
				default:
					System.out.println(user.pet.getName() + " will be waiting for you.");
					break;
			}
		}while(choice >= 1 && choice < 8);
	}
	private void selectPet() {
		store.browsePets();

		do {
			// Getting user's choice
			Scanner sc = new Scanner(System.in);
			String inName = sc.nextLine();

			// Finding pet in store
			try {
				user.setPet(store.buyPet(inName));
			} catch (NoPetException e) {
				e.printStackTrace();
			}
		}while(!hasPet());
	}
	private void setUpUser(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello there. I see you are a new user.\nIf you are looking to become a new pet owner, please input your name.\nIf not, please type q.");
		String input = sc.nextLine();
		
		if(input.length() == 1 && (input.charAt(0) == 'q' || input.charAt(0) == 'Q')){
			System.out.println("Maybe next time you'll love someone other than yourself....");
			System.exit(0);
		}
		else{
			user = new Owner(input, null);
			allOwners.add(user);
		}
	}

	private boolean hasPet(){
		if(user.getPet() == null) {
			return false;
		}
		else{
			return true;
		}
	}

}
