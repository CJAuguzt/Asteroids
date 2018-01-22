import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
public class SmAsteroid extends MovingObject{
	public static int size = 16;
	public SmAsteroid()
	{
		this.x = 1920 * (int) Math.random();
		this.y = 1080 * (int) Math.random();
		this.speed = 3;
		this.direction = 360 * (int) Math.random();
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
