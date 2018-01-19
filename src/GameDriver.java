import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JFrame;

import java.awt.EventQueue;

public class GameDriver{

	public static void main(String[] args) {
		//EventQueue allows for keys to be listened for
		EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                
                Board game = new Board();
                Board.inGame = true;
            }
        });
	}
}