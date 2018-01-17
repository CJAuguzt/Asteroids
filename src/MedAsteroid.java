public class MedAsteroid extends MovingObject{
	public MedAsteroid(float x, float y, float vx, float vy, float direction) {
		super(x, y, vx, vy, 0);
	}
	public void Break() {
		setExists(false);
		new SmAsteroid(this.getX(), this.getY(), (float)Math.random(), (float)Math.random(), 0);
		new SmAsteroid(this.getX(), this.getY(), (float)Math.random(), (float)Math.random(), 0);
	}
}