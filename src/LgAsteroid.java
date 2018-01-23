import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class LgAsteroid extends MovingObject{
	private static int size = 48;
	public LgAsteroid()
	{
		super((int) (Math.random() * 1920), (int) (Math.random() * 1080), 2, (int) (Math.random() * 360));
	}
	
	//Deletes LgAsteroid object and replaces it with two MedAsteroid objects
	public void Break()
	{
		setExists(false);
		speed = 0;
		Board.Asteroids.remove(this);
		Board.Asteroids.add(new MedAsteroid(this.getX(), this.getY()));
		Board.Asteroids.add(new MedAsteroid(this.getX(), this.getY()));
		Board.incrementScore(100);
	}
	
	public void move()
    {
        x += speed * Math.sin(Math.toRadians(direction));
        y += speed * Math.cos(Math.toRadians(direction));
        wrap();
    }
	
	//Gets hitbox of asteroid
	public Rectangle getBounds() {
	    return new Rectangle(x, y, size, size);
	}
	
	public Image getImage()
	{
		return new ImageIcon("Images/Asteroids/AL.png").getImage();
	}
}
