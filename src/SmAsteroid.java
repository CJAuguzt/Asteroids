public class SmAsteroid extends MovingObject{
	public SmAsteroid() {
		super((float)Math.random()*1920, (float)Math.random()*1000,
		(float)Math.random()*24-12, (float)Math.random()*24-12, 100);
		//zero arg constructor, use the variable direction as a makeshift point value since it doesn't do anything in the asteroids
	}
	public SmAsteroid(float x, float y, float vx, float vy, float direction) {
		super(x, y, vx, vy, 100);
		//multi argument constructor used so that when a MedAsteroid breaks, two smalls can be spawned in it's place
	}
	public void Break() {
		setExists(false);
		/*Asteroids are added to an ArrayList which allows them to exist on the board
		 * Method sets said boolean to false where the game runs a constant while loop to remove any objects which "don't exist"
		 */
	}
}
