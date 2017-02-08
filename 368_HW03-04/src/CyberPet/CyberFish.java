package CyberPet;

import java.time.LocalDate;

public class CyberFish extends CyberPet {
	// Instance Variables
	private scale fishScale;
	
	enum scale{
		Rainbow,
		Dull,
		Bright,
		Marvel;
	}

	public CyberFish(String name, char gender, LocalDate birthday, PetState state, int inHunger, int inTiredness,
			int inLoneliness, int inEnergy, scale inScale) {
		super(name, gender, birthday, state, inHunger, inTiredness, inLoneliness, inEnergy);
		this.fishScale = inScale;
		// TODO Auto-generated constructor stub
	}

	public CyberFish(String name, char gender, LocalDate birthday, PetState state, scale inScale) {
		super(name, gender, birthday, state);
		this.fishScale = inScale;
		// TODO Auto-generated constructor stub
	}

	public CyberFish(String name, char gender, LocalDate birthday, scale inScale) {
		super(name, gender, birthday);
		this.fishScale = inScale;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("I am a fish and I am moving.");
	}

	@Override
	public void eat() {
		System.out.println("I am a fish and I am eating.");
	}

	@Override
	public void sleep() {
		System.out.println("I am a fish and am sleeping. Shhhhh.");
	}
	
	public void spray(){
		System.out.println("Take this puny human! *Squirts water*");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((fishScale == null) ? 0 : fishScale.hashCode());
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
		CyberFish other = (CyberFish) obj;
		if (fishScale != other.fishScale)
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "***CyberFish***" + super.toString() + "\nScale Color: " + this.fishScale + "\n"; 
	}
}
