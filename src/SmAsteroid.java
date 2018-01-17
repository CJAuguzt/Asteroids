import java.awt.Image;
import javax.swing.ImageIcon;
public class SmAsteroid extends MovingObject{
	public SmAsteroid(float x, float y, float vx, float vy, float direction) {
		super(x, y, vx, vy, 0);
	}
	public void Break() {
		setExists(false);
	}
}
