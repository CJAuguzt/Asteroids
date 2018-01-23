import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyBinding extends KeyAdapter {
	public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        //Rotates ship counter-clockwise
        if (key == KeyEvent.VK_LEFT) {
        	Board.player.setAngle(Board.player.getAngle() + 5);
        }

        //Rotates ship clockwise
        if (key == KeyEvent.VK_RIGHT) {
        	Board.player.setAngle(Board.player.getAngle() - 5);
        }

        //Increases speed of ship
        if (key == KeyEvent.VK_UP) {
            Board.player.setSpeed(-2);
        }
        
        //Shoots projectile
        if(key == KeyEvent.VK_SPACE)
        {
        	Board.player.shoot();
        }
    }
	
	public void keyReleased(KeyEvent e) {
		//Decreases speed of ship
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP) {
            Board.player.setSpeed(0);
        }
    }
}
