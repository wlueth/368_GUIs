package CyberPet;

import java.time.LocalDate;

public class CyberDog extends CyberPet {
	// Instance Variables
	private size dSize;
	
	enum size{
		Purse,
		Small,
		Medium,
		Large,
		Child_Eater;
	}

	public CyberDog(String name, char gender, LocalDate birthday, PetState state, int inHunger, int inTiredness,
			int inLoneliness, int inEnergy, size inSize) {
		super(name, gender, birthday, state, inHunger, inTiredness, inLoneliness, inEnergy);
		this.dSize = inSize;
	}

	public CyberDog(String name, char gender, LocalDate birthday, PetState state, size inSize) {
		super(name, gender, birthday, state);
		this.dSize = inSize;
	}

	public CyberDog(String name, char gender, LocalDate birthday, size inSize) {
		super(name, gender, birthday);
		this.dSize = inSize;
	}

	@Override
	public void move() {
		System.out.println("I am a dog and I am moving.");
	}

	@Override
	public void eat() {
		System.out.println("I am a dog and I am eating.");
	}

	@Override
	public void sleep() {
		System.out.println("I am a dog and am sleeping. Shhhhh.");
	}
	
	public void bark(){
		System.out.println("Be afraid of my bark! WOOOOOOOOOOOOOOOOOOOF!");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dSize == null) ? 0 : dSize.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CyberDog other = (CyberDog) obj;
		if (dSize != other.dSize)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "***CyberDog***" + super.toString() + "\nSize: " + this.dSize + "\n"; 
	}
}
