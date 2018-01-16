import java.awt.event.KeyEvent;
import java.util.Scanner;

public class GameDriver {
	public static int keyValue = 0;
	public static void main (String []args) {
		//creates new instance of the Board to start game
		Board menu = new Board();
		// looks to see if you are in the Main Menu
		while (Board.inBoard == true) {
			KeyEvent e;
			int key = e.getKeyCode();
	        if (key == KeyEvent.VK_ENTER) {
	        	keyValue = 1;
	        }
	        if (key == KeyEvent.VK_UP){
	        	keyValue = 2;
	        }
	        if (key == KeyEvent.VK_DOWN) {
	        	keyValue = 3;
	        }
	        
			if (keyValue == 1) {
				Board.inBoard = false;
			}
	      }
	}

	/*public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
        	keyValue = 1;
        }
        if (key == KeyEvent.VK_UP){
        	keyValue = 2;
        }
        if (key == KeyEvent.VK_DOWN) {
        	keyValue = 3;
        }
	}*/

	int livesRemaining = 3; //starts off with 3 lives remaining 

	void addLife() {

	}

	int wave = 1; // starts at wave 1, with set number of Asteroids to begin with

	void startWave() {
	}

	int score = 0;// starts with score of zero to be added onto

	void ScoreUp() {
	}
	}
	
