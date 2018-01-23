import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Projectile extends MovingObject
{
	public long time = System.currentTimeMillis();
	private long existenceLength;
	Image image = new ImageIcon("Images/Ship/Projectile.png").getImage();
	
	public Projectile(int x, int y, int direction) {
		super(x, y, 3, direction);
		this.size = 6;
	}
	
	//Moves projectile based on angle
	public void move()
    {
        x -= 3 * Math.sin(Math.toRadians(direction));
        y -= 3 * Math.cos(Math.toRadians(direction));
        wrap();
    }
	
	//Deletes projectile after 2 seconds
	public void remove()
	{
		if ((System.currentTimeMillis() - time) >= 2000)
		{
			this.setExists(false);
		}
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