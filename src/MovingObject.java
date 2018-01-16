public class MovingObject
{
	public float direction;
	public float x;
	public float y;
	public float vx;
	public float vy;
	public boolean exists;
	
	public void move()
	{
		x += (vx * Math.cos(Math.toRadians(direction)));
		y += (vy * Math.sin(Math.toRadians(direction)));
		this.wrap();
	}
	
	public void wrap()
	{
		if(this.x > 1920 || this.x < 0 || this.y > 1080 || this.y < 0)
		{
			this.x = (1920-x);
			this.y = (1080-y);
		}
	}
	
	public MovingObject(float x, float y, float vx, float vy, float direction)
	{
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.direction = direction;
		this.exists = true;
	}
	
	public float getX()
	{
		return x;
	}
	
	public void setX(float in)
	{
		x = in;
	}
	
	public float getY()
	{
		return y;
	}
	
	public void setY(float in)
	{
		y = in;
	}
	
	public float getVX()
	{
		return vx;
	}
	
	public void setVX(float in)
	{
		vx = in;
	}
	
	public float getVY()
	{
		return vy;
	}
	
	public void setVY(float in)
	{
		vy = in;
	}
	
	public float getDirection()
	{
		return direction;
	}
	
	public void setDirection(float in)
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
}