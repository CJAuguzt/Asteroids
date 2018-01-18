import java.util.ArrayList;

public class GameDriver {
	public static int score = 0;
	public static int livesRemaining = 3;
	public static int livesGained = 0;
	public static int wave = 1;
	public static int keyValue = 0;
	public static ArrayList<MovingObject> Asteroids = new ArrayList<MovingObject>();
	public static ArrayList<Ship> Ships = new ArrayList<Ship>();
	public static ArrayList<Projectile> Projectiles = new ArrayList<Projectile>();

	public static void main(String[] args) {
		Board Game = new Board();
		while (Board.inBoard == true) {
			KeyBinding.updateMenu();
		}
	}

	{
		while (wave != 0) {
			for (int i = 0; i < Asteroids.size(); i++) {
				if (Asteroids.get(i).getExists() == false) {
					ScoreUp((int) Asteroids.get(i).getDirection());
					if (Asteroids.get(i).getDirection() == 50) {

		while (Board.inBoard == true) {
			if(Ships.get(0).getExists()==false) {
				Ships.remove(0);
				if(livesRemaining != 0) {
					Ships.add(new Ship());
				}
			}
			for(int i=0; i<Asteroids.size(); i++) {
				if(Asteroids.get(i).getExists() == false) {
					ScoreUp((int)Asteroids.get(i).getDirection());
					if(Asteroids.get(i).getDirection() == 50) {
						Asteroids.add(new MedAsteroid());
						Asteroids.add(new MedAsteroid());
					} else if (Asteroids.get(i).getDirection() == 100) {
						Asteroids.add(new SmAsteroid());
						Asteroids.add(new SmAsteroid());
					}
					Asteroids.remove(i);
					i--;

				}
			}
			if (Ships.get(0).getExists() == false) {
				Ships.remove(0);
				if (livesRemaining != 0) {
					Ships.add(new Ship());
				}
			}
		}
					}
				}
			}
		}
	}

	static void addLife() {
		livesRemaining++;
	}

	static void startWave() {
		while (Asteroids.size() < 3 + wave) {
			Asteroids.add(new LgAsteroid());
			Ships.remove(0);
			Ships.add(new Ship());
		}

	}

	static void ScoreUp(int scoreGained) {
		score += scoreGained;
		if (score >= (livesGained + 1) * 10000) {
			addLife();
			livesGained++;
		}
	}
}