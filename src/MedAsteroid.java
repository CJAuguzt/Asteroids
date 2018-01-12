public class MedAsteroid extends MovingObject{
	public MedAsteroid(float vx, float vy) {
		this.vx = vx;
		this.vy = vy;
	}
	public void Break() {
		//delet this
		new SmAsteroid((float)(Math.random()*13)-6,(float)(Math.random()*13)-6);
		new SmAsteroid((float)(Math.random()*13)-6,(float)(Math.random()*13)-6);
	}
}
