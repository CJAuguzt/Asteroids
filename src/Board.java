/*V1 
 * CJA 1/11/2018
 */
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
//import java.awt.Image;
import javax.swing.JPanel;
public class Board {
	ImageIcon background;
	JLabel label1; 
	
	public Board() {
		JFrame jf = new JFrame("Asteroids");
	        jf.setVisible(true);
	        jf.setSize(1920,1040);
	        jf.setResizable(true);
	        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        ImageIcon img = new ImageIcon(getClass().getResource("S1V2.png"));
	        jf.setIconImage(img.getImage());	
	        
	        JLabel jl = new JLabel();
	        jl.setIcon(new ImageIcon(getClass().getResource("Background.png")));
	        JPanel jp = (JPanel)jf.getContentPane();

	        jp.add(jl);
	        
	        //sets Image Icon        
	    }
	}