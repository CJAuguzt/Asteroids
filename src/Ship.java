//"C:/Users/Evan/Documents/GitHub/Asteroids/Images/Ship/S1V2.png"
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Ship{
    private int x;
    private int y;
    private Image image;
    private int angle;
    private int speed;
    private int size = 32;

    public Ship()
    {
    	image = new ImageIcon("Images/Ship/Rotations/S1V2.png").getImage();
    	x = 960;
    	y = 540;
    	angle = 0;
    	speed = 0;
    }

    //Moves ship based on speed of ship
    public void move()
    {
        rectifyDirection();
        x += speed * Math.sin(Math.toRadians(angle));
        y += speed * Math.cos(Math.toRadians(angle));
        wrap();
    }

    //Creates new Projectile object
    private void shoot() {
    	Board.Projectiles.add(new Projectile(x + 32, y + 32, angle));
	}

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        //Rotates ship counter-clockwise
        if (key == KeyEvent.VK_LEFT) {
        	angle += 5;
        }

        //Rotates ship clockwise
        if (key == KeyEvent.VK_RIGHT) {
        	angle -= 5;
        }

        //Increases speed of ship
        if (key == KeyEvent.VK_UP) {
            speed = -2;
        }
        
        //Shoots projectile
        if(key == KeyEvent.VK_SPACE)
        {
        	shoot();
        }
    }

	public void keyReleased(KeyEvent e) {
        
		//Decreases speed of ship
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP) {
            speed = 0;
        }
    }
    
	//Wraps ship around edge of board
    public void wrap()
	{
		if(this.x > 1920 || this.x < 0)
		{
			this.x = (1920 - x);
		}
		
		if(this.y > 1080 || this.y < 0)
		{
			this.y = (1080 - y);
		}
	}
    
    //Aligns ship to specific direction
    public void rectifyDirection()
    {
    	int imageAngle = angle - (angle % 10);
    	
    	//Wraps angle after 0 degrees
    	if(angle < 0)
    	{
    		angle += 360;
    	
    	//Wraps angle after 359 degrees
    	}else if(angle >= 360)
    	{
    		angle -= 360;
    	}
    	
    	//Loads image of rotated ship
    	if(imageAngle == 0)
    	{
            image = new ImageIcon("Images/Ship/Rotations/S1V2.png").getImage();
    	}else
    	{
            image = new ImageIcon("Images/Ship/Rotations/S1V2_" + imageAngle  + ".png").getImage();

    	}
    }
    
    //Gets hitbox of ship
    public Rectangle getBounds() {
	    return new Rectangle(x + 16, y + 16, size, size);
	}

    //Gets x coordinate of ship
    public int getX() {
        return x;
    }

    //Gets y coordinate of ship
    public int getY() {
        return y;
    }
	
    //Sets x coordinate of ship
	public void setX(int in)
	{
		x = in;
	}
	
	//Sets y coordinate of ship
	public void setY(int in)
	{
		y = in;
	}
	
	//Gets speed of ship
	public int getSpeed()
	{
		return speed;
	}
	
	//Sets speed of ship
	public void setSpeed(int in)
	{
		speed = in;
	}

	//Gets ship image texture
    public Image getImage() {
        return this.image;
    }
    
    //Gets angle of ship
    public int getAngle()
    {
    	return angle;
    }
    
    //Sets angle of ship
    public void setAngle(int in)
    {
    	angle = in;
    }
}