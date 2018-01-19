import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;


public class Board extends JFrame {
	// public static boolean inBoard;
	public static boolean inGame;
	
	public Board() {
		addKeyListener(new KeyBinding());
		setFocusable(true);
		requestFocusInWindow();
		setResizable(false);
		setTitle("Asteroids");
		
		ImageIcon icon = new ImageIcon("Images/Ship/S1V2.png");
		setIconImage(icon.getImage());
		
		setContentPane(new JLabel(new ImageIcon("Images/menu/Background.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1920,1080);
		setVisible(true);
		}

	void drawShip(Graphics g) {
		Ship ship = new Ship();
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(ship.getImage(), (int) ship.getX(), (int) ship.getY(), this);
	}
	
	void drawScore(Graphics g) {
		
	}
	
	void drawLives(Graphics g) {
		
	}
	
	
}