public class LgAsteroid extends MovingObject{
	public LgAsteroid(float x, float y, float vx, float vy, float direction, boolean exists) {
		super(x, y, vx, vy, direction, exists);
	}
	public void Break() {
		//delet
		new MedAsteroid((float)(Math.random()*7)-6, (float)(Math.random()*7)-6);
		new MedAsteroid((float)(Math.random()*7)-6, (float)(Math.random()*7)-6);
	}
}
