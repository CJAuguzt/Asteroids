
	import java.awt.BorderLayout;
	import java.awt.EventQueue;
	import java.awt.event.KeyEvent;
	import java.awt.event.KeyListener;
	import javax.swing.JFrame;
	import javax.swing.JTextArea;
	import javax.swing.JScrollPane;

	public class KeyBinding extends JFrame{
	    JTextArea inputText;
	    JTextArea feedbackText;

	     //Note: Typically the main method will be in a
	    //separate class. As this is a simple one class
	    //example it's all in the one class.
	    public KeyBinding()
	    {

	        //make sure the program exits when the frame closes
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setTitle("Console");
	        setSize(700,200);
	      
	        //This will center the JFrame in the middle of the screen
	        setLocationRelativeTo(null);
	        
	        //This JTextArea is used to display information about
	        //the keylistener events. It's place in a JScrollPane
	        //to allow the scrolling through all the events triggered
	        feedbackText = new JTextArea();
	        JScrollPane scrollText = new JScrollPane(feedbackText);
	        
	        //This JTextArea will trigger the KeyListener events as
	        //long as it hold the focus
	        inputText = new JTextArea();
	        
	        //The KeyListener interface is implemented as an anonymous
	        //inner class using the addKeyListener method.
	        inputText.addKeyListener(new KeyListener()
	        {
	              //When any key is pressed and released then the 
	              //keyPressed and keyReleased methods are called respectively.
	              //The keyTyped method is called when a valid character is typed.
	              //The getKeyChar returns the character for the key used. If the key
	              //is a modifier key (e.g., SHIFT, CTRL) or action key (e.g., DELETE, ENTER)
	              //then the character will be a undefined symbol.
	              @Override 
	              public void keyPressed(KeyEvent e)
	              {
	                 
	            	  if(e.getKeyCode() == KeyEvent.VK_ENTER) {
	            		 feedbackText.append("Key Pressed: ENTER\n");
	            		Board.inBoard = false;
	            		  
	            	  }
	              }
	              @Override
	              public void keyReleased(KeyEvent e)
	              {
	                  //feedbackText.append("Key Released: " + e.getKeyChar() + "\n");
	              }
	              
	              @Override
	              public void keyTyped(KeyEvent e)
	              {
	                  //The getKeyModifiers method is a handy
	                  //way to get a String representing the
	                  //modifier key.
	                  //feedbackText.append("Key Typed: " + e.getKeyChar() + " " + KeyEvent.getKeyModifiersText(e.getModifiers()) + "\n");
	              }
	        });
	     
	        add(inputText, BorderLayout.NORTH);
	        add(scrollText, BorderLayout.CENTER);
	        setVisible(true);
	       
	    }
	    
	}

