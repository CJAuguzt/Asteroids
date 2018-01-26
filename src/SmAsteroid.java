import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
public class SmAsteroid extends MovingObject{
	public static int size = 32;
	
	public SmAsteroid(int x, int y)
	{
		super(x, y, 4, (int)(360 * Math.random()));
		}

	//Deletes SmAsteroid object and increases score
	public void Break() {
		setExists(false);
		Board.Asteroids.remove(this);
		Board.incrementScore(100);
	}
	
	//Gets hitbox of asteroid
	public Rectangle getBounds() {
	    return new Rectangle(x, y, size, size);
	}
	
	public Image getImage()
	{
		return new ImageIcon("Images/Asteroids/AS.png").getImage();
	}
}