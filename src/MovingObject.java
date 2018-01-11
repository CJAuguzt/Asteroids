
public abstract class MovingObject {
	private double speed;
	private int direction, distanceTravelled;
	
	public double[] move(int speed, int direction)
	{
		double[] result = new double[2];
		
		result[0] = speed * Math.cos(Math.toRadians(direction));
		result[1] = speed * Math.sin(Math.toRadians(direction));
		
		return result;
	}
	
	public void fadeAway()
	{}
}