import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Board extends JPanel {
	// public static boolean inBoard;
	public static boolean inGame;
	public static int score = 0;
	public static int livesRemaining = 3;
	public static int livesGained = 0;
	public static int wave = 1;
	public static ArrayList<MovingObject> Asteroids = new ArrayList<MovingObject>();
	public static ArrayList<Ship> Ships = new ArrayList<Ship>();
	public static ArrayList<Projectile> Projectiles = new ArrayList<Projectile>();
	public static JFrame window = new JFrame();
	private final int ship_size = 32;
	static Image ship;
	static Image asteroidL;
	static Image asteroidM;
	static Image asteroidS;
	static Image projectile;

	public Board() {
		window.addKeyListener(new KeyBinding());
		window.setFocusable(true);
		window.requestFocusInWindow();
		window.setResizable(false);
		window.setTitle("Asteroids");
		
		loadImages();
		window.setIconImage(ship);
		
		window.add(this);
		
		window.setContentPane(new JLabel(new ImageIcon("Images/menu/Background.png")));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(1920,1080);
		window.setVisible(true);
		
		}
	
	private void loadImages()
	{
		ship = new ImageIcon("Images/Ship/S1V2.png").getImage();
		projectile = new ImageIcon("Images/Ship/Projectile.png").getImage();
		asteroidL = new ImageIcon("Images/Asteroids/AL.png").getImage();
		asteroidM = new ImageIcon("Images/Asteroids/AM.png").getImage();
		asteroidS = new ImageIcon("Images/Asteroids/AS.png").getImage();
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		doDrawing(g);
	}
	
	private void doDrawing(Graphics g)
	{
		if(inGame)
		{
			g.drawImage(ship, 960, 540, this);
			Toolkit.getDefaultToolkit().sync();
		}
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(ship, 400, 300, null);
	}
	
	public void actionPerformed(ActionEvent e) {
        repaint();
    }
	
	void drawScore(Graphics g) {
		
	}
	
	void drawLives(Graphics g) {
		
	}
	
	void update()
	{
		while (wave != 0) {
			if(!Ships.get(0).getExists()) {
				Ships.remove(0);
				if(livesRemaining != 0) {
					Ships.add(new Ship());
				}
			}
			for(int i=0; i<Asteroids.size(); i++) {
				if(Asteroids.get(i).getExists() == false) {
					ScoreUp((int)Asteroids.get(i).getDirection());
					if(Asteroids.get(i).getDirection() == 50) {
						Asteroids.add(new MedAsteroid());
						Asteroids.add(new MedAsteroid());
					} else if (Asteroids.get(i).getDirection() == 100) {
						Asteroids.add(new SmAsteroid());
						Asteroids.add(new SmAsteroid());
					}
					Asteroids.remove(i);
					i--;

				}
			}
			if (Ships.get(0).getExists() == false) {
				Ships.remove(0);
				if (livesRemaining != 0) {
					Ships.add(new Ship());
				}
			}
		}
	}

	static void addLife() {
		livesRemaining++;
	}

	static void startWave() {
		while (Asteroids.size() < 3 + wave) {
			Asteroids.add(new LgAsteroid());
		}
		Ships.remove(0);
		Ships.add(new Ship());
	}

	void ScoreUp(int scoreGained) {
		score += scoreGained;
		if (score >= (livesGained + 1) * 10000) {
			addLife();
			livesGained++;
		}
	}
}