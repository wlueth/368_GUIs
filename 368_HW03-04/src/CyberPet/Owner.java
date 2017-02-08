package CyberPet;

public class Owner {
	// Instance Variables
	private String name;
	CyberPet pet;
	
	public Owner(String name, CyberPet pet){
		this.name = name;
		this.pet = pet;
	}

	public Owner(String name) {this.name = name; this.pet = null;}
	
	/**
	 * @return the pet
	 */
	public CyberPet getPet() {
		return pet;
	}
	/**
	 * @param pet the pet to set
	 */
	public void setPet(CyberPet pet) {
		this.pet = pet;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pet == null) ? 0 : pet.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pet == null) {
			if (other.pet != null)
				return false;
		} else if (!pet.equals(other.pet))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if(this.name == null && this.pet == null){
			return "No Owner Or Pet Recognized";
		}
		else if(this.pet == null){
			return "Owner " + name + " has no pet";
		}
		else if(this.name == null){
			return "No Owner Recognized";
		}
		else {
			return name + " is the owner of " + pet.getName() + ".";
		}
	}
		
}
