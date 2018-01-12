public class MovingObject {
	private float direction;
	private float x;
	private float y;
	private float vx;
	private float vy;
	private float distanceTravelled;
	private boolean exists;
	
	public void move()
	{
		x += vx;
		y += vy;
	}
	
	public MovingObject(float x, float y, float vx, float vy, float direction)
	{
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.direction = direction;
		this.distanceTravelled = 0;
		this.exists = true;
	}
	
	public void fadeAway()
	{}
	public void Break() {};
	
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