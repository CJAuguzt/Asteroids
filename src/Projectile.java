
public class Projectile extends MovingObject
{
	private long time = System.currentTimeMillis();
	private long existenceLength;
	
	public Projectile(float x, float y, float vx, float vy, float direction)
	{
		super(x, y, vx, vy, direction);
	}
	
	public void remove()
	{
		if ((System.currentTimeMillis() - time) >= 2000)
		{
			this.exists = false;
		}
		return;
	}
}