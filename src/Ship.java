
public class Ship extends MovingObject {
	public static final String IMG_FILE = "Images/Ship/S1V2.png";
	public static final int SIZE = 32;
	public static final double INIT_POS_X = 300;
	public static final double INIT_POS_Y = 300;
	public static final double INIT_VEL_X = 0;
	public static final double INIT_VEL_Y = 0;
	public static final double INIT_F_THETA = 0;
	public static final double INIT_D_THETA = 0;

/**
 * Note that, because we don't need to do anything special when constructing
 * a Square, we simply use the superclass constructor called with the
 * correct parameters
 */
public Ship(double vel_x, double vel_y, double pos_x, double pos_y, int boardWidth, 
        int boardHeight, double f_theta, double d_theta, String img_file) {
    super(vel_x, vel_y, pos_x, pos_y, SIZE, SIZE, boardWidth, boardHeight,
            f_theta, d_theta, img_file);

}

}
