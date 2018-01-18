public class MedAsteroid extends MovingObject{
	public MedAsteroid() {
		super((float)Math.random()*1920, (float)Math.random()*1000,
		(float)Math.random()*12-6, (float)Math.random()*12-6, 0);
	}
	public MedAsteroid(float x, float y, float vx, float vy, float direction) {
		super(x, y, vx, vy, 100);
	}
	public void Break() {
		setExists(false);
		new SmAsteroid(this.getX(), this.getY(), (float)Math.random()*24-12, (float)Math.random()*24-12, 0);
		new SmAsteroid(this.getX(), this.getY(), (float)Math.random()*24-12, (float)Math.random()*24-12, 0);
	}
}