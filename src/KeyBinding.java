import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class KeyBinding extends JFrame{
	public static boolean[] keys = new boolean[256];

	public KeyBinding() {
		new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				keys[e.getKeyCode()] = true;
			}

			public void keyReleased(KeyEvent e) {
				keys[e.getKeyCode()] = false;
			}

			public void keyTyped(KeyEvent e) {
			}
		};
	}

	public static void updateMenu() {
		
		if (keys[KeyEvent.VK_ENTER] && (Board.inBoard == true)) {
			System.out.println("ENTER key has been pressed in the MENU");
		}
		if (keys[KeyEvent.VK_UP] && (Board.inBoard == true)) {
			System.out.println("UP key has been pressed in the MENU");
		}

		if (keys[KeyEvent.VK_DOWN] && (Board.inBoard == true)) {
			System.out.println("DOWN key has been pressed in the MENU");
		}
	}

	public void updateGame() {

	}
}
