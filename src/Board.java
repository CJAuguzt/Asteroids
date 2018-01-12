/*V1 
 * CJA 1/11/2018
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
//used for Board constructor
//import java.io.*; 
//import javax.imageio.*;
//used for debugging
public class Board extends JFrame {
	ImageIcon icon;
	public Board() {
			setTitle("Asteroids");
	        setResizable(true);
	        icon = new ImageIcon("Images/Ship/S1V2.png");
	        setIconImage(icon.getImage());
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        //Debugging
	        //try {
	        //setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Images/menu/MainMenu1.png")))));
	        //}catch(IOException e)
	        //{
	        //	System.out.println("Image Doesn't Exist");
			//}
	        setContentPane(new JLabel(new ImageIcon("Images/menu/MainMenu1.png")));
	        setSize(1920,1080);
	        
	}
}