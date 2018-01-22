import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
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
    private static Ship player;
    
    public Board() {

        initBoard();
    }
    
    private void initBoard() {
        
        addKeyListener(new TAdapter());
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

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(player.getImage(), player.getX(), player.getY(), this);
        for(Projectile element: Projectiles)
        {
        	if(element.getExists())
        	{
        		g2d.drawImage(element.getImage(), element.getX(), element.getY(),this);
        		element.remove();
        		}else
        	{
        		element = null;
        	}
        }
        for(MovingObject element: Asteroids)
        {
        	if(element.getExists())
        	{
        		g2d.drawImage(element.getImage(), element.getX(), element.getY(),this);
        		}else
        	{
        		element = null;
        	}
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        update();
		player.move();
        for(Projectile element: Projectiles)
        {
        	element.move();
        }
        for(MovingObject element: Asteroids)
        {
        	element.move();
        }
        repaint();  
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            player.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
        }
    }
    
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
    		}
    	}
    }
    
    public void checkHit()
    {
    	for(MovingObject target: Asteroids)
    	{
    		for(Projectile bullet: Projectiles)
    		{
    			if(bullet.getBounds().intersects(target.getBounds()))
    			{
    				bullet.remove();
    				target.Break();
    			}
    		}
    	}
    }
    
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
    
    public void startWave()
    {
    	for(int i = 0; i <= 3 + wave; i++)
    	{
    		Asteroids.add(new LgAsteroid());
    	}
    	wave++;
    	System.out.println("Wave: " + wave);
    }
    
    public void update()
    {
    	checkCollision();
    	if(wave == 0)
    	{
    		startWave();
    	}else
    	{
    		if(livesRemaining == -1)
    		{
    			player.setSpeed(0);
    			for(Projectile element: Projectiles)
    			{
    				element.setSpeed(0);
    			}
    			for(MovingObject element: Asteroids)
    			{
    				element.setSpeed(0);
    			}
    		}else
    		{
    			boolean waveOver = true;
    			for(MovingObject element: Asteroids)
    			{
    				if(element != null)
    				{
    					waveOver = false;
    					break;
    				}
    			}
    			if(waveOver)
    			{
    				startWave();
    			}
    		}
    	}
    }
}