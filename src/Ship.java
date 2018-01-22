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


    public void move()
    {
        rectifyDirection();
        x += speed * Math.sin(Math.toRadians(angle));
        y += speed * Math.cos(Math.toRadians(angle));
        wrap();
    }

    private void shoot() {
    	Board.Projectiles.add(new Projectile(x + 32, y + 32, angle));
	}

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
        	angle += 5;
        }

        if (key == KeyEvent.VK_RIGHT) {
        	angle -= 5;
        }

        if (key == KeyEvent.VK_UP) {
            speed = -2;
        }
        
        if(key == KeyEvent.VK_SPACE)
        {
        	shoot();
        }
    }

	public void keyReleased(KeyEvent e) {
        
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP) {
            speed = 0;
        }
    }
    
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
    
    public void rectifyDirection()
    {
    	int imageAngle = angle - (angle % 10);
    	if(angle < 0)
    	{
    		angle += 360;
    	}else if(angle >= 360)
    	{
    		angle -= 360;
    	}
    	if(imageAngle == 0)
    	{
            image = new ImageIcon("Images/Ship/Rotations/S1V2.png").getImage();
    	}else
    	{
            image = new ImageIcon("Images/Ship/Rotations/S1V2_" + imageAngle  + ".png").getImage();

    	}
    }
    
    public Rectangle getBounds() {
	    return new Rectangle(x + 16, y + 16, size, size);
	}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
	
	public void setX(int in)
	{
		x = in;
	}
	
	public void setY(int in)
	{
		y = in;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public void setSpeed(int in)
	{
		speed = in;
	}

    public Image getImage() {
        return this.image;
    }
    
    public int getAngle()
    {
    	return angle;
    }
    
    public void setAngle(int in)
    {
    	angle = in;
    }
}