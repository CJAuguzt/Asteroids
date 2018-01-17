public class LgAsteroid extends MovingObject{
	public LgAsteroid() {
		super((float)Math.random()*1920, (float)Math.random()*1000,
		(float)Math.random()*6-3, (float)Math.random()*6-3, 0);
	}
	public LgAsteroid(float x, float y, float vx, float vy, float direction) {
		super(x, y, vx, vy, 0);
	}
	public void Break() {
		setExists(false);
		new MedAsteroid(this.getX(), this.getY(), (float)Math.random()*12-6, (float)Math.random()*12-6, 0);
		new MedAsteroid(this.getX(), this.getY(), (float)Math.random()*12-6, (float)Math.random()*12-6, 0);
	}
}
