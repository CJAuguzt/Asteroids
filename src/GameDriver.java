import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import javax.swing.JFrame;

import java.util.ArrayList;

public class GameDriver {
	public static int score = 0;
	public static int livesRemaining = 3;
	public static int livesGained = 0;
	public static int wave = 1;
	public static int keyValue = 0;
	public static ArrayList<MovingObject> Asteroids = new ArrayList<MovingObject>();

	public static void main(String[] args) {
		Board menu = new Board();
		//KeyBinding guiFrame = new KeyBinding();
		/*EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new KeyBinding();
			}
		});*/
		
	}

	{
		while(wave!=0)
	{
			for(int i=0; i<Asteroids.size(); i++) {
				if(Asteroids.get(i).getExists() == false) {
					Asteroids.remove(i);
					i--;
				}
			}
		}
	}

	void addLife() {
		livesRemaining++;
	}

<<<<<<< HEAD
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
=======
>>>>>>> origin/master
	void startWave() {
		while (Asteroids.size() < 3 + wave) {
			Asteroids.add(new LgAsteroid());
		}
	}

	void ScoreUp(int scoreGained)
	{
		score += scoreGained;
		if(score >= (livesGained + 1) * 10000)
		{
			 addLife();
			 livesGained++;
		}
	}
}