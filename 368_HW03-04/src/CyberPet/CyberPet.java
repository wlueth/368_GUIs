package CyberPet;

import java.time.LocalDate;
import java.time.Period;

abstract class CyberPet {
	// Instance Variables
	
	private String name;
	private char gender;
	private LocalDate birthday;
	private PetState state;
	private HealthStatus health;
	private final int ID_NUM;
	
	// Class Variable
	private static int ID_COUNTER = 0;
	
	/**
	 * @param name
	 * @param gender
	 * @param birthday
	 * @param state
	 * @param health
	 */
		// I think this is the problem
	public CyberPet(String name, char gender, LocalDate birthday, PetState state, int inHunger, int inTiredness, int inLoneliness, int inEnergy) {
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.state = state;
		HealthStatus temp = new HealthStatus(inHunger, inTiredness, inLoneliness, inEnergy);
		temp.setHealth(inHunger, inTiredness, inLoneliness, inEnergy);
		this.health = temp;
		ID_NUM = ID_COUNTER;
		ID_COUNTER++;
	}
	
	public CyberPet(String name, char gender, LocalDate birthday, PetState state){
		this(name, gender, birthday, state, 1, 1, 2, 1);
	}
	public CyberPet(String name, char gender, LocalDate birthday) {
		this(name, gender, birthday, PetState.SLEEPING, 5, 3, 1, 0);
	}

	// TODO: methods for interaction
	
	public abstract void move();
	
	public abstract void eat();
	
	public abstract void sleep();
	
	// Comparable
	public void compareTo(CyberPet inPet){
		// Couldn't figure it out
	}
	
	// Overriding hashCode and equals
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID_NUM;
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + gender;
		result = prime * result + ((health == null) ? 0 : health.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof CyberPet)) {
			return false;
		}
		CyberPet other = (CyberPet) obj;
		if (ID_NUM != other.ID_NUM) {
			return false;
		}
		if (birthday == null) {
			if (other.birthday != null) {
				return false;
			}
		} else if (!birthday.equals(other.birthday)) {
			return false;
		}
		if (gender != other.gender) {
			return false;
		}
		if (health == null) {
			if (other.health != null) {
				return false;
			}
		} else if (!health.equals(other.health)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (state != other.state) {
			return false;
		}
		return true;
	}
	
	
	// Getters and Setters

	/**
	 * @return the age
	 */
	public int getAge(){
		
		
		LocalDate today = LocalDate.now();
		
		// Commented section gives exact years, months and days since birthday
		
		/*int years = Period.between(birthday, today).getYears();
		int months = Period.between(birthday, today).getMonths();
		int days = Period.between(birthday, today).getDays();
		
		System.out.println("Years: " + years + "\nMonths: " + months + "\nDays: " + days);*/
		
		int years = Period.between(birthday, today).getYears();
		
		return years;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the state
	 */
	public PetState getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(PetState state) {
		this.state = state;
	}

	/**
	 * @return the health
	 */
	public HealthStatus getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int inHunger, int inTiredness, int inLoneliness, int inEnergy) {
		HealthStatus temp = new HealthStatus(inHunger, inTiredness, inLoneliness, inEnergy);
		temp.setHealth(inHunger, inTiredness, inLoneliness, inEnergy);
		this.health = temp;
	}

	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}

	/**
	 * @return the birthday
	 */
	public LocalDate getBirthday() {
		return birthday;
	}

	/**
	 * @return the iD_NUM
	 */
	public int getID_NUM() {
		return ID_NUM;
	}

	// Overriding toString method
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nID #: " + ID_NUM + "\nName: " + name + "\nGender: " + gender 
				+ "\nBirthday: " + birthday + "\nAge: " + getAge() + " years old\nCurrent State: " + state + "\nCurrent Health: " + health.toString(); 
	}

}
