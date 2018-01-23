import java.awt.EventQueue;
import javax.swing.JFrame;

public class GameDriver extends JFrame {
	public static GameDriver ex;

    public GameDriver() {
        
        initUI();
    }
    
    //Prepares window and UI of game
    private void initUI() {
        
        add(new Board());
        
        setSize(1920, 1080);
        setResizable(false);
        
        setTitle("Asteroids");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ex = new GameDriver();
                ex.setVisible(true);
            }
        });
    }
}