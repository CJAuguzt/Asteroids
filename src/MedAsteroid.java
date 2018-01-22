import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class MedAsteroid extends MovingObject{
	public static int size = 32;
	public MedAsteroid() {
		this.x = 1920 * (int) Math.random();
		this.y = 1080 * (int) Math.random();
		this.speed = 3;
		this.direction = 360 * (int) Math.random();
		}
	
	public void Break()
	{
		setExists(false);
		Board.Asteroids.remove(this);
		Board.Asteroids.add(new SmAsteroid());
		Board.Asteroids.add(new SmAsteroid());
		Board.incrementScore(250);
	}
	
	public Rectangle getBounds() {
	    return new Rectangle(x, y, size, size);
	}
	
	public Image getImage()
	{
		return new ImageIcon("Images/Asteroids/AM.png").getImage();
	}
}