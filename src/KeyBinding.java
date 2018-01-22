import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyBinding extends KeyAdapter {
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key  == KeyEvent.VK_ENTER && Board.GAMESTATE==Board.INTRO) {
			System.out.println("ENTER key has been pressed in the MENU");
			Board.GAMESTATE = Board.PLAYING;
		}
		if (key == KeyEvent.VK_UP && Board.GAMESTATE==Board.PLAYING) {
			System.out.println("UP key has been pressed in the GAME");
		}
		if (key == KeyEvent.VK_DOWN && Board.GAMESTATE==Board.PLAYING) {
			System.out.println("DOWN key has been pressed in the GAME");
		}
		if (key == KeyEvent.VK_RIGHT && Board.GAMESTATE==Board.PLAYING) {
			System.out.println("RIGHT key has been pressed in the GAME");
		}
		if (key == KeyEvent.VK_LEFT && Board.GAMESTATE==Board.PLAYING) {
			System.out.println("LEFT key has been pressed in the GAME");
		}
		if (key == KeyEvent.VK_SPACE && Board.GAMESTATE==Board.PLAYING) {
			System.out.println("SPACE key has been pressed in the GAME");
		}
	}
}
