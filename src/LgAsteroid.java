import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class LgAsteroid extends MovingObject{
	private static int size = 48;
	public LgAsteroid()
	{
		super(1920 * (int) Math.random(), 1080 * (int) Math.random(), 3, 360 * (int) Math.random());
	}
	
	public void Break()
	{
		setExists(false);
		Board.Asteroids.remove(this);
		Board.Asteroids.add(new MedAsteroid());
		Board.Asteroids.add(new MedAsteroid());
		Board.incrementScore(100);
	}
	
	public Rectangle getBounds() {
	    return new Rectangle(x, y, size, size);
	}
	
	public Image getImage()
	{
		return new ImageIcon("Images/Asteroids/AL.png").getImage();
	}
}
