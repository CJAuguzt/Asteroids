import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class MedAsteroid extends MovingObject{
	public static int size = 32;
	public MedAsteroid(int x, int y) {
		super(x, y, 3, 360 * (int) Math.random());
		}
	
	//Deletes MedAsteroid object and replaces it with two SmAsteroid objects
	public void Break()
	{
		setExists(false);
		Board.Asteroids.remove(this);
		Board.Asteroids.add(new SmAsteroid(this.getX(), this.getY()));
		Board.Asteroids.add(new SmAsteroid(this.getX(), this.getY()));
		Board.incrementScore(250);
	}
	
	//Gets hitbox of asteroid
	public Rectangle getBounds() {
	    return new Rectangle(x, y, size, size);
	}
	
	public Image getImage()
	{
		return new ImageIcon("Images/Asteroids/AM.png").getImage();
	}
}