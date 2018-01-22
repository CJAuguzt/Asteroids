
public class Asteroid extends MovingObject {
	public static final int SIZE = 64;
	public static final double INIT_F_THETA = 0;
	public static final double INIT_D_THETA = 90;

	public Asteroid(double vel_x, double vel_y, double pos_x, double pos_y ,
	        int boardWidth, int boardHeight, int aType) {
		    super(vel_x, vel_y, pos_x, pos_y, (int)(Math.floor(120.0/aType)), 
		            (int)(Math.floor(120.0/aType)),
	                boardWidth, boardHeight, INIT_F_THETA, INIT_D_THETA, "Images/Asteroids/A"+aType+".png");
	}
	public int getAsteroidType() {
	    return (int)(SIZE/this.width);
	}
	

	
	

}
