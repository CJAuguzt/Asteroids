import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class LgAsteroid extends MovingObject{
<<<<<<< HEAD
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
=======
	public LgAsteroid() {
		super((float)Math.random()*1920, (float)Math.random()*1000,
		(float)Math.random()*6-3, (float)Math.random()*6-3, 20);
		//Another zero arg constructor for an easy to access code and also so that it can be called when the game starts
	}
	public LgAsteroid(float x, float y, float vx, float vy, float direction) {
		super(x, y, vx, vy, 20);
		//multi arg constructor in case of emergency, mostly just a failsafe
	}
	public void Break() {
		setExists(false);
		new MedAsteroid(this.getX(), this.getY(), (float)Math.random()*12-6, (float)Math.random()*12-6, 0);
		new MedAsteroid(this.getX(), this.getY(), (float)Math.random()*12-6, (float)Math.random()*12-6, 0);
		/*Method has the same functionality as the Break() method in the MedASteroid
		 * Sets the boolean to false, gets removed from the asteroid ArrayList by the while loop
		 Spawns two MedAsteroids in the place the Large Asteroid*/
>>>>>>> fe7dbcc1298f8ad45ba30ce11f44782f16800690
	}
}
