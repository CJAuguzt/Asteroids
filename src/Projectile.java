import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Projectile extends MovingObject
{
	private long time = System.currentTimeMillis();
	private long existenceLength;
	public static int size = 6;
	Image image = new ImageIcon("Images/Ship/Projectile.png").getImage();
	
	public Projectile(int x, int y, int direction) {
		super(x, y, 3, direction);
	}
	
	public void move()
    {
        x -= 3 * Math.sin(Math.toRadians(direction));
        y -= 3 * Math.cos(Math.toRadians(direction));
        wrap();
    }
	
	public void remove()
	{
		if ((System.currentTimeMillis() - time) >= 2000)
		{
			this.setExists(false);
		}
		return;
	}
	
	public Rectangle getBounds()
	{
		return new Rectangle(x, y, size, size);
	}
	
	public Image getImage()
	{
		return image;
	}
}