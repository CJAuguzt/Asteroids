public class MedAsteroid extends MovingObject{
	public MedAsteroid() {
		super((float)Math.random()*1920, (float)Math.random()*1000,
		(float)Math.random()*12-6, (float)Math.random()*12-6, 50);
		//Another zero argument constructor for the sake of having one, this "point value" is 50
	}
	public MedAsteroid(float x, float y, float vx, float vy, float direction) {
		super(x, y, vx, vy, 50);
		//This is used for the same purpose as the multi argument constructor for the small Asteroid when the large ones break it spawns two of these
	}
	public void Break() {
		setExists(false);
		new SmAsteroid(this.getX(), this.getY(), (float)Math.random()*24-12, (float)Math.random()*24-12, 0);
		new SmAsteroid(this.getX(), this.getY(), (float)Math.random()*24-12, (float)Math.random()*24-12, 0);
		/*Method sets boolean to false which makes it get removed from the Asteroid ArrayList like the SmallAsteroid
		 * Method then spawns two small asteroids in the place that the medium one was shot
		 */
	}
}