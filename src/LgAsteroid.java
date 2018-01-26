import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class LgAsteroid extends MovingObject{
	public LgAsteroid()
	{
		super((int) (Math.random() * 1920), (int) (Math.random() * 1080), 2, (int) (Math.random() * 360));
		size = 96;
	}
	
	//Deletes LgAsteroid object and replaces it with two MedAsteroid objects
	public void Break()
	{
		System.out.println("Break");
		speed = 0;
		setExists(false);
		Board.Asteroids.remove(this);
		Board.Asteroids.add(new MedAsteroid(this.getX(), this.getY()));
		Board.Asteroids.add(new MedAsteroid(this.getX(), this.getY()));
		Board.incrementScore(20);
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
