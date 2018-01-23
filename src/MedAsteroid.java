import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class MedAsteroid extends MovingObject{
	public static int size = 32;
	public MedAsteroid() {
<<<<<<< HEAD
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
=======
		super((float)Math.random()*1920, (float)Math.random()*1000,
		(float)Math.random()*12-6, (float)Math.random()*12-6, 50);
		//Another zero argument constructor for the sake of having one, this "point value" is 50
	}
	public MedAsteroid(float x, float y, float vx, float vy, float direction) {
		super(x, y, vx, vy, 50);
		//This is used for the same purpose as the multi argument constructor for the small Asteroid when the large ones break it spawns two of these
	}
	public void Break() {
		setExists(false);
		new SmAsteroid(this.getX(), this.getY(), (float)Math.random()*24-12, (float)Math.random()*24-12, 0);
		new SmAsteroid(this.getX(), this.getY(), (float)Math.random()*24-12, (float)Math.random()*24-12, 0);
		/*Method sets boolean to false which makes it get removed from the Asteroid ArrayList like the SmallAsteroid
		 * Method then spawns two small asteroids in the place that the medium one was shot
		 */
>>>>>>> fe7dbcc1298f8ad45ba30ce11f44782f16800690
	}
}