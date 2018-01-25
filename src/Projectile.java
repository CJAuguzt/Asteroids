import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Projectile extends MovingObject
{
	public long time = System.currentTimeMillis();
	private long existenceLength;
	Image image = new ImageIcon("Images/Ship/Projectile.png").getImage();
	private int collided = 0; 
	public Projectile(int x, int y, int direction) {
		super(x, y, 6, direction);
		this.size = 6;
	}
	//Moves projectile based on angle
	public void move()
    {
        x -= speed * Math.sin(Math.toRadians(direction));
        y -= speed * Math.cos(Math.toRadians(direction));
        wrap();
    }
	

	public void setCollided(int num) {
		this.collided = -1;
	}
	//Deletes projectile after 2 seconds and checks if the projectile collided with asteroid
	public void remove()
	{
		if ((System.currentTimeMillis() - time) >= 1500)
		{
			this.setExists(false);
		
		} if (collided == -1) 
			this.setExists(false);
		
		return;
	}
	
	//Gets hitbox of projectile
	public Rectangle getBounds()
	{
		return new Rectangle(x, y, size, size);
	}
	
	//Gets image of projectile texture
	public Image getImage()
	{
		return image;
	}
}