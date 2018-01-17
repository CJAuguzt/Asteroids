import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.ArrayList;

public class GameDriver {
	public static int score = 0;
	public static int livesRemaining = 3;
	public static int livesGained = 0;
	public static int wave = 1;
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

	void addLife() {
		livesRemaining++;
	}

<<<<<<< HEAD
=======
	int wave = 1; // starts at wave 1, with set number of Asteroids to begin with
	ArrayList<MovingObject> Asteroids = new ArrayList<MovingObject>();
	while(wave != 0) {
		for(int i=0; i<Asteroids.size(); i++) {
			if(Asteroids.get(i).getExists() == false) {
				Asteroids.remove(i);
				i--;
			}
		}
	}
>>>>>>> origin/master
	void startWave() {
		while(Asteroids.size()<3+wave) {
			Asteroids.add(new LgAsteroid());
		}
	}

	void ScoreUp()
	{
		if(score >= (livesGained + 1) * 10000)
		{
			 addLife();
			 livesGained++;
		}
	}
	}
	
