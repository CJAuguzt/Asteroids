
/*V1 
 * needs to use Java Nonblocking IO
 * CJA 1/11/2018
 */
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;
import com.sun.prism.Image;
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
    public static boolean inBoard;
	public Board() {
		new KeyBinding();
		prepMenu();
		if (!inBoard) {
			prepGame();
		}
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
		//setSize(WIDTH, HEIGHT);
		pack();
		}
	
	private void prepGame() {
		setVisible(true);
		setTitle("Asteroids");
		setResizable(true);
		ImageIcon icon = new ImageIcon("Images/Ship/S1V2.png");
		setIconImage(icon.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new JLabel(new ImageIcon("Images/menu/Background.png")));
		//setSize(WIDTH, HEIGHT);
		pack();
	}
	
	void drawShip(Graphics g)
	{
		Ship ship = new Ship();
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(ship.getImage(), (int) ship.getX(), (int) ship.getY(), this);
	}
}