
public class Ship extends MovingObject{
	private static int maxSpeed;
	private float acceleration;
	
	void shoot(int direction)
	{}
	
	void rotateClockwise()
	{}
	
	void rotateCounterClockwise()
	{}
	
	void accelerate()
	{}
	
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