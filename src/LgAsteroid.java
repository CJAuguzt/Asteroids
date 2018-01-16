public class LgAsteroid extends MovingObject{
	public LgAsteroid(float x, float y, float vx, float vy, float direction) {
		super(x, y, vx, vy, direction);
	}
	public void Break() {
		setExists(false);
		new MedAsteroid(this.getX(), this.getY(), (float)Math.random(), (float)Math.random(), (float)0);
		new MedAsteroid(this.getX(), this.getY(), (float)Math.random(), (float)Math.random(), (float)0);
	}
}
