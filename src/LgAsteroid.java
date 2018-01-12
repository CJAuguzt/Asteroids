public class LgAsteroid extends MovingObject{
	public LgAsteroid(float vx, float vy) {
		this.vx = vx;
		this.vy = vy;
	}
	public void Break() {
		//delet
		new MedAsteroid((float)(Math.random()*7)-6, (float)(Math.random()*7)-6);
		new MedAsteroid((float)(Math.random()*7)-6, (float)(Math.random()*7)-6);
	}
}
