public class SmAsteroid extends MovingObject{
	public SmAsteroid(float x, float y, float vx, float vy, float direction, boolean exists) {
		super(x, y, vx, vy, direction, exists);
	}
	public void Break() {
		setExists(false);
	}
}
