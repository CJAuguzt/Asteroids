import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
public class SmAsteroid extends MovingObject{
	public static int size = 16;
	
	public SmAsteroid(int x, int y)
	{
		super(x, y, 3, 360 * (int) Math.random());
		}
	
	public void Break() {
		setExists(false);
		Board.Asteroids.remove(this);
		Board.incrementScore(1000);
	}
	
	public Rectangle getBounds() {
	    return new Rectangle(x, y, size, size);
	}
	
	public Image getImage()
	{
		return new ImageIcon("Images/Asteroids/AS.png").getImage();
	}
}