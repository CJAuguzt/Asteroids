import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyBinding extends KeyAdapter {
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_ENTER && Board.inGame == true) {
			System.out.println("ENTER key has been pressed in the GAME");
		}
		if (key == KeyEvent.VK_UP) {
			System.out.println("UP key has been pressed in the GAME");
			
		}
		if (key == KeyEvent.VK_DOWN) {
			System.out.println("DOWN key has been pressed in the GAME");
		}
		if (key == KeyEvent.VK_RIGHT) {
			System.out.println("RIGHT key has been pressed in the GAME");
		}
		if (key == KeyEvent.VK_LEFT) {
			System.out.println("LEFT key has been pressed in the GAME");
		}
		if (key == KeyEvent.VK_SPACE) {
			System.out.println("SPACE key has been pressed in the GAME");
			
		}
	}
}
