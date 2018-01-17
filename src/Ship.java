public class Ship extends MovingObject
{
	private final int maxSpeed = -1;
	private float acceleration;
	
	public Ship()
	{
		super((float)(Board.WIDTH/2), (float)(Board.HEIGHT/2), 0, 0, 0);
	}
	
	void shoot(int direction)
	{
		new Projectile(this.x, this.y, (this.vx + 10), (this.vy + 10), this.direction);
	}
	
	void rotateClockwise()
	{
		direction++;
		if(direction > 360)
		{
			direction -= 360;
		}
	}
	
	void rotateCounterClockwise()
	{
		direction--;
		if(direction < 0)
		{
			direction += 360;
		}
	}
	
	void accelerate()
	{
		int totalSpeed = (int) Math.sqrt((Math.pow(vx, 2))+(Math.pow(vy, 2)));
		if(totalSpeed >= maxSpeed)
		{
			return;
		}
	}
	
	void collision()
	{}
	
	void respawn()
	{}
	
	public float getAcceleration()
	{
		return acceleration;
	}
	
	public void setAcceleration(float in)
	{
		acceleration = in;
	}
}