import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.TreeSet;

import javax.swing.ImageIcon;

public class Board extends JPanel {
	public static boolean inGame;
	
    private static boolean playing = true;
    private static boolean upArrow = false;
    private static boolean rightArrow = false;
    private static boolean spaceBar = false;
    private static boolean leftArrow = false;
    
    public static final int BOARD_WIDTH = 1920;
	public static final int BOARD_HEIGHT = 1080;
    public static int END = 0;
    public static int INTRO = 1;
    public static int GAMESTATE = 1;
    public static int PLAYING = 2;
	public static int myScore = 0;
	public static int livesRemaining;
	public static int livesGained;
	public static int wave = 1;
	
	public static TreeSet<MovingObject> allObjects = new TreeSet<MovingObject>();
	public static ArrayList<MovingObject> Asteroids = new ArrayList<MovingObject>();
	public static ArrayList<Ship> Ships = new ArrayList<Ship>();
	public static ArrayList<Projectile> Projectiles = new ArrayList<Projectile>();
	public static JFrame window = new JFrame();
	
	static Ship ship;
	static Image shipIcon;
	static Image asteroidL;
	static Image asteroidM;
	static Image asteroidS;
	static Image projectile;

	public Board() {
		window.addKeyListener(new KeyBinding());
		window.setFocusable(true);
		window.setResizable(false);
		window.setTitle("Asteroids");

		loadImages();
		window.setIconImage(shipIcon);

		window.setContentPane(new JLabel(new ImageIcon("Images/menu/Background.png")));
		  
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(BOARD_WIDTH, BOARD_HEIGHT);
		window.setVisible(true);
	}

	
	  private void loadImages() { ImageIcon iis = new
	  ImageIcon("Images/Ship/S1V2.png"); 
	  shipIcon = iis.getImage();
	  
	  /*mageIcon iip = new ImageIcon("Images/Ship/Projectile.png"); 
	  projectile =
	  iip.getImage();
	  
	  ImageIcon iial = new ImageIcon("Images/Asteroids/AL.png"); 
	  asteroidL =
	  iial.getImage();
	  
	  ImageIcon iiam = new ImageIcon("Images/Asteroids/AM.png"); 
	  asteroidM =
	  iiam.getImage();
	  
	  ImageIcon iias = new ImageIcon("Images/Asteroids/AS.png");
	  asteroidS =
	  iias.getImage();*/
	  }
	  
	  public void reset() {
		    playing = true;
		    myScore = 0;
		    livesRemaining = 3;
			livesGained = 0;
		    upArrow = false;
		    rightArrow = false;
		    spaceBar = false;
		    leftArrow = false;

		    GAMESTATE = INTRO;
	        ship = new Ship(0, 0, 340, 340, BOARD_WIDTH, 
	               BOARD_HEIGHT, 0, 0, "Images/Ship/S1V2.png");
	        allObjects = new TreeSet<MovingObject>();
			requestFocusInWindow();
		}

	public void playGame(Graphics g) {
		allObjects.add(ship);
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		for (MovingObject o : allObjects) {
			o.draw(g2d);
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		doDrawing(g);
	}

	private void doDrawing(Graphics g) {
		if (GAMESTATE == PLAYING) {
			g.drawImage(shipIcon, 960, 540, this);
			Toolkit.getDefaultToolkit().sync();
		}
	}

	public void actionPerformed(ActionEvent e) {
		repaint();
	}
}
/*
 * void drawScore(Graphics g) {
 * 
 * }
 * 
 * void drawLives(Graphics g) {
 * 
 * }
 * 
 * void update() { while (wave != 0) { if(!Ships.get(0).getExists()) {
 * Ships.remove(0); if(livesRemaining != 0) { Ships.add(new Ship()); } } for(int
 * i=0; i<Asteroids.size(); i++) { if(Asteroids.get(i).getExists() == false) {
 * ScoreUp((int)Asteroids.get(i).getDirection());
 * if(Asteroids.get(i).getDirection() == 50) { Asteroids.add(new MedAsteroid());
 * Asteroids.add(new MedAsteroid()); } else if (Asteroids.get(i).getDirection()
 * == 100) { Asteroids.add(new SmAsteroid()); Asteroids.add(new SmAsteroid()); }
 * Asteroids.remove(i); i--;
 * 
 * } } if (Ships.get(0).getExists() == false) { Ships.remove(0); if
 * (livesRemaining != 0) { Ships.add(new Ship()); } } } }
 * 
 * static void addLife() { livesRemaining++; }
 * 
 * static void startWave() { while (Asteroids.size() < 3 + wave) {
 * Asteroids.add(new LgAsteroid()); } Ships.remove(0); Ships.add(new Ship()); }
 * 
 * void ScoreUp(int scoreGained) { score += scoreGained; if (score >=
 * (livesGained + 1) * 10000) { addLife(); livesGained++; } } }
 */