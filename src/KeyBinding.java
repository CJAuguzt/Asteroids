import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class KeyBinding extends JFrame{
	boolean[] keys;
	public KeyBinding() {
		new KeyListener() {
			//boolean[] keys;
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
	//boolean[] keys;
	public void update() {
		if (keys[KeyEvent.VK_ENTER]) {
			System.out.println("ENTER key has been pressed");
		}
	    if(keys[KeyEvent.VK_UP]){
	        System.out.println("UP key has been pressed");
	    }

	    if(keys[KeyEvent.VK_DOWN]){
	        
	    }

	    if(keys[KeyEvent.VK_LEFT]){
	       
	    }

	    if(keys[KeyEvent.VK_RIGHT]){
	       
	    }
	}
}
