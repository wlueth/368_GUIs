package CyberPet;

import java.time.LocalDate;

public class CyberCat extends CyberPet {
	// Instance Variables
	private color catColor;
	
	enum color{
		Orange,
		Black,
		Brown,
		White,
		Striped;
	}

	public CyberCat(String name, char gender, LocalDate birthday, PetState state, int inHunger, int inTiredness,
			int inLoneliness, int inEnergy, color inColor) {
		super(name, gender, birthday, state, inHunger, inTiredness, inLoneliness, inEnergy);
		this.catColor = inColor;
		// TODO Auto-generated constructor stub
	}

	public CyberCat(String name, char gender, LocalDate birthday, PetState state, color inColor) {
		super(name, gender, birthday, state);
		this.catColor = inColor;
		// TODO Auto-generated constructor stub
	}

	public CyberCat(String name, char gender, LocalDate birthday, color inColor) {
		super(name, gender, birthday);
		this.catColor = inColor;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("I am a cat and I am moving.");
	}

	@Override
	public void eat() {
		System.out.println("I am a cat and I am eating.");
	}

	@Override
	public void sleep() {
		System.out.println("I am a cat and am sleeping. Shhhhh.");
	}
	
	public void purr(){
		System.out.println("I'm so cute, seeee. Prrrrrrrrrr.");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((catColor == null) ? 0 : catColor.hashCode());
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
		CyberCat other = (CyberCat) obj;
		if (catColor != other.catColor)
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "***CyberCat***" + super.toString() + "\nColor: " + this.catColor + "\n"; 
	}
}
