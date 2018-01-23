<<<<<<< HEAD
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
=======
public class SmAsteroid extends MovingObject{
	public SmAsteroid() {
		super((float)Math.random()*1920, (float)Math.random()*1000,
		(float)Math.random()*24-12, (float)Math.random()*24-12, 100);
		//zero arg constructor, use the variable direction as a makeshift point value since it doesn't do anything in the asteroids
	}
	public SmAsteroid(float x, float y, float vx, float vy, float direction) {
		super(x, y, vx, vy, 100);
		//multi argument constructor used so that when a MedAsteroid breaks, two smalls can be spawned in it's place
	}
	public void Break() {
		setExists(false);
		/*Asteroids are added to an ArrayList which allows them to exist on the board
		 * Method sets said boolean to false where the game runs a constant while loop to remove any objects which "don't exist"
		 */
>>>>>>> fe7dbcc1298f8ad45ba30ce11f44782f16800690
	}
}
