package CyberPet;

public class HealthStatus{
	//Instance Variables
	private int hunger, tiredness, loneliness, energy, overallScore;
	private healthLevel health;
	
	private final int MIN = 0;
	private final int MAX = 10;

	public enum healthLevel{
		Unhealthy,
		Healthy,
		Superstar;
	}
	
	public HealthStatus(int inHunger, int inTiredness, int inLoneliness, int inEnergy){
		this.hunger = inHunger;
		this.tiredness = inTiredness;
		this.loneliness = inLoneliness;
		this.energy = inEnergy;
	}
	
	public void setHealth(int inHunger, int inTiredness, int inLoneliness, int inEnergy){
		calcScore();

		if(energy < 3){this.health = healthLevel.Unhealthy;}
		else if(energy < 6){this.health = healthLevel.Healthy;}
		else {
			if (overallScore < 12) {
				this.health = healthLevel.Superstar;
			} else if (overallScore < 25) {
				this.health = healthLevel.Healthy;
			} else {
				this.health = healthLevel.Unhealthy;
			}
		}
	}
	
	private int calcScore(){
		calcHelp();
		overallScore = hunger + tiredness + loneliness;
		return overallScore;
	}
	
	private void calcHelp(){
		while(MIN > hunger)
			this.hunger = MIN;
		while(MAX < hunger)
			this.hunger = MAX;
		while(MIN > tiredness)
			this.tiredness = MIN;
		while(MAX < tiredness)
			this.tiredness = MAX;
		while(MIN > loneliness)
			this.loneliness = MIN;
		while(MAX < loneliness)
			this.loneliness = MAX;
		while(MIN > energy)
			this.energy = MIN;
		while(MAX < energy)
			this.energy = MAX;
	}

	public void setHunger(int inHunger) {this.hunger = hunger + inHunger; setHealth(this.hunger, this.tiredness, this.loneliness, this.energy);}
	public void setTiredness(int inTiredness) {this.tiredness = tiredness + inTiredness; setHealth(this.hunger, this.tiredness, this.loneliness, this.energy);}
	public void setLoneliness(int inLoneliness) {this.loneliness = loneliness + inLoneliness; setHealth(this.hunger, this.tiredness, this.loneliness, this.energy);}
	public void setEnergy(int inEnergy) {this.energy = energy + inEnergy; setHealth(this.hunger, this.tiredness, this.loneliness, this.energy);}
	public String getHealthLevels(){
		return "Hunger: " + hunger + "\nTiredness: " + tiredness + "\nLoneliness: " + loneliness + "\nEnergy: " + energy;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return health.name();
	}
	
}