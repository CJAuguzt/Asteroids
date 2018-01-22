import java.awt.Image;
import java.awt.Rectangle;

public class MovingObject
{
	protected int direction;
	protected int x;
	protected int y;
	protected int speed;
	private boolean exists;
	private Image image;
	private int size;
	
	public void move()
    {
        x += speed * Math.sin(Math.toRadians(direction));
        y += speed * Math.cos(Math.toRadians(direction));
        wrap();
    }
	
	public void wrap()
	{
		if(this.x > 1920 || this.x < 0)
		{
			this.x = (1920 - x);
		}
		
		if(this.y > 1080 || this.y < 0)
		{
			this.y = (1080 - y);
		}
	}
	
	public MovingObject()
	{}
	
	public MovingObject(int x, int y, int speed, int direction)
	{
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.exists = true;
		System.out.println("Object created");
	}
	
	public Rectangle getBounds() {
	    return new Rectangle(x, y, size, size);
	}
	
	public void loadImage(Image in)
	{
		this.image = in;
	}
	
	public Image getImage()
	{
		return image;
	}
	
	public int getX()
	{
		return x;
	}
	
	public void setX(int in)
	{
		x = in;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setY(int in)
	{
		y = in;
	}
	
	public int getDirection()
	{
		return direction;
	}
	
	public void setDirection(int in)
	{
		direction = in;
	}
	
	public boolean getExists()
	{
		return exists;
	}
	
	public void setExists(boolean in)
	{
		exists = in;
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public void setSpeed(int in)
	{
		this.speed = in;
	}
	
	public void Break()
	{
		
	}
}