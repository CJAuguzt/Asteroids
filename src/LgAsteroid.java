public class LgAsteroid extends MovingObject{
	public LgAsteroid() {
		super((float)Math.random()*1920, (float)Math.random()*1000,
		(float)Math.random()*6-3, (float)Math.random()*6-3, 20);
		//Another zero arg constructor for an easy to access code and also so that it can be called when the game starts
	}
	public LgAsteroid(float x, float y, float vx, float vy, float direction) {
		super(x, y, vx, vy, 20);
		//multi arg constructor in case of emergency, mostly just a failsafe
	}
	public void Break() {
		setExists(false);
		new MedAsteroid(this.getX(), this.getY(), (float)Math.random()*12-6, (float)Math.random()*12-6, 0);
		new MedAsteroid(this.getX(), this.getY(), (float)Math.random()*12-6, (float)Math.random()*12-6, 0);
		/*Method has the same functionality as the Break() method in the MedASteroid
		 * Sets the boolean to false, gets removed from the asteroid ArrayList by the while loop
		 Spawns two MedAsteroids in the place the Large Asteroid*/
	}
}
