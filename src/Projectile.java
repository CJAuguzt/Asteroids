
public class Projectile extends MovingObject
{
	public static final String IMG_FILE = "Images/ship/Projectile.png";
    public static final int SIZE = 6;
    /**
     * Note that, because we don't need to do anything special when constructing
     * a Square, we simply use the superclass constructor called with the
     * correct parameters
     */
    public Projectile(double Velx, double Vely, double x, double y,  int boardWidth,
            int boardHeight, double f_theta, double d_theta) {
        super(Velx, Vely, x, y, SIZE, SIZE, boardWidth,
                boardHeight, f_theta, d_theta,IMG_FILE);
    }
}