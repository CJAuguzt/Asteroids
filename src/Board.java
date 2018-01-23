import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.Timer;


public class Board extends JPanel implements ActionListener {

    private final int DELAY = 10;
    public static boolean inGame;
	public static int score = 0;
	public static int livesRemaining = 3;
	public static int livesGained = 0;
	public static int wave = 0;
	public static ArrayList<MovingObject> Asteroids = new ArrayList<MovingObject>();
	public static ArrayList<Projectile> Projectiles = new ArrayList<Projectile>();
	private Timer timer;
    static Ship player;
    
    public Board() {
        initBoard();
    }
    
    //Sets up JPanel object
    private void initBoard() {
        
        addKeyListener(new KeyBinding());
        setFocusable(true);
        setBackground(Color.BLACK);
        player = new Ship();
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }

    //Handles drawing of objects(ship, asteroids, projectiles)
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(player.getImage(), player.getX(), player.getY(), this);
        for(Projectile element: Projectiles)
        {
        	if(element.getExists())
        	{
        		g2d.drawImage(element.getImage(), element.getX(), element.getY(),this);
        		element.remove();
        	}
        }
        for(MovingObject element: Asteroids)
        {
        	if(element.getExists())
        	{
        		g2d.drawImage(element.getImage(), element.getX(), element.getY(),this);
        	}
        }
        //Displays score and remaining lives
        g.setColor(Color.WHITE);
        g.drawString("Score: " + score, 15, 15);
        g.drawString("Lives: " + livesRemaining, 15, 30);
        
        //Displays game over message on player death
        if(!inGame)
        {
        	String msg = "Game Over";
            Font small = new Font("Helvetica", Font.BOLD, 14);
            FontMetrics fm = getFontMetrics(small);

            g.setColor(Color.white);
            g.setFont(small);
            g.drawString(msg, (1920 - fm.stringWidth(msg)) / 2, 1080 / 2);
            livesRemaining = -1;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        update();        
		player.move();
        for(Projectile element: Projectiles)
        {
        	if(element.getExists())
        	{
        		element.move();
        	}
        }
        for(MovingObject element: Asteroids)
        {
        	if(element.getExists())
        	{
        		element.move();
        	}
        }
        repaint();  
    }
    
    //Checks whether ship has collided with asteroid
    public void checkCollision()
    {
    	for(MovingObject element: Asteroids)
    	{
    		if(element.getBounds().intersects(player.getBounds()))
    		{
    			livesRemaining--;
    			System.out.println("Lives remaining: " + livesRemaining);
    			player.setX(960);
    			player.setY(540);
    			player.setSpeed(0);
    			player.setAngle(0);
    			element.Break();
    			break;
    		}
    	}
    }
    
    //Checks whether projectile has hit asteroid
    public void checkHit()
    {
    	for(MovingObject target: Asteroids)
    	{
    		for(Projectile bullet: Projectiles)
    		{
    			if(target.getBounds().intersects(bullet.getBounds()) && target.getExists() && bullet.getExists())
    			{
    				bullet.remove();
    				bullet = null;
    				target.Break();
    				return;
    			}
    		}
    	}
    }
    
    //Increases score by given amount
    public static void incrementScore(int in)
    {
    	score += in;
    	if(score >= 10000 * (1 + livesGained))
    	{
    		livesRemaining++;
    		livesGained++;
    		System.out.println("Lives remaining: " + livesRemaining);
    	}
    	System.out.println("score: " + score);
    }
    
    //Handles starting of new wave
    public void startWave()
    {
    	for(int i = 0; i <= 3 + wave; i++)
    	{
    		Asteroids.add(new LgAsteroid());
    	}
    	wave++;
    	System.out.println("Wave: " + wave);
    }
    
    //Handles miscellaneous update routines
    public void update()
    {
    	checkCollision();
    	checkHit();
    	
    	//Initializes first wave of game
    	if(wave == 0)
    	{
    		startWave();
    	}else
    	{
    		//Handles end of game following player death
    		if(livesRemaining == -1)
    		{
    			//Halts movement of all objects
    			player.setSpeed(0);
    			for(Projectile element: Projectiles)
    			{
    				element.setSpeed(0);
    			}
    			for(MovingObject element: Asteroids)
    			{
    				element.setSpeed(0);
    			}
    			inGame = false;
    		}else
    		{
    			//Checks if current wave has completed
    			boolean waveOver = true;
    			for(MovingObject element: Asteroids)
    			{
    				if(element != null)
    				{
    					waveOver = false;
    					break;
    				}
    			}
    			//Begins new wave at end of current wave
    			if(waveOver)
    			{
    				startWave();
    			}
    		}
    	}
    	//Updates wave number and score in title bar
    	GameDriver.ex.setTitle("Asteroids     Wave: " + wave + "     Lives: " + livesRemaining + "     Points: " + score);
    }
}