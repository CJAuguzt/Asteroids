import java.awt.*;
import javax.swing.*;
public class SmAsteroid extends MovingObject{
	public SmAsteroid(float x, float y, float vx, float vy, float direction) {
		super(x, y, vx, vy, direction);
	}
	public void Break() {
		setExists(false);
	}
	ImageIcon image = new ImageIcon();
}
