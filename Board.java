/* V1 
 * 
 * CJA 1/11/2018
 */

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Image;
public class Board{
        public Board(){
        JFrame jf = new JFrame("Asteroids");
        jf.setVisible(true);
        jf.setSize(1920,1080);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("H:\\Asteroids\\Images\\S1V1.png");
        jf.setIconImage(img.getImage());
        //sets Image Icon
        Image BACKGROUND = new Image("H:\\Asteroids\\Images\\S1V1.png");
        jf.setBackground(BACKGROUND.getImage());
    }
}
