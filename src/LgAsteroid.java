public class LgAsteroid extends MovingObject{
	public LgAsteroid(float x, float y, float vx, float vy, float direction) {
		super(x, y, vx, vy, 0);
	}
	public void Break() {
		setExists(false);
		new MedAsteroid(this.getX(), this.getY(), (float)Math.random(), (float)Math.random(), 0);
		new MedAsteroid(this.getX(), this.getY(), (float)Math.random(), (float)Math.random(), 0);
	}
}
