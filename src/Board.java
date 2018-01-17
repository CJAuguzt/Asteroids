
/*V1 
 * needs to use Java Nonblocking IO
 * CJA 1/11/2018
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;

//used for Board constructor
//import java.io.*; 
//import javax.imageio.*;
//used for debugging
public class Board extends JFrame
{
	public static final int WIDTH = 1920;
	public static final int HEIGTH = 1080;
	static boolean inBoard = false;
	public Board() {
		prepMenu();
		if (inBoard == false) prepGame();
	}
	public void prepMenu() {
		inBoard = true;
		setVisible(true);
		setTitle("Asteroids");
		setResizable(true);
		ImageIcon icon = new ImageIcon("Images/Ship/S1V2.png");
		setIconImage(icon.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new JLabel(new ImageIcon("Images/menu/MainMenu1.png")));
		setSize(1920, 1080);
		}
	
	private void prepGame() {
		setVisible(true);
		setTitle("Asteroids");
		setResizable(true);
		ImageIcon icon = new ImageIcon("Images/Ship/S1V2.png");
		setIconImage(icon.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new JLabel(new ImageIcon("Images/menu/Background.png")));
		setSize(1920, 1080);

	}
}