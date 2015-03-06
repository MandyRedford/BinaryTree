package skater;
import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class DrawingMale extends JPanel{
	/*Mandy Redford
	 * creates a blue circle to symbolize that male was selected
	 * 	
	 */
	public void paintComponent(Graphics g){//this method was taken from Karas example neccesary for graphics
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
			
			diamond(g);
		
}

	public static void diamond(Graphics g) {
		//drawas the shape, gooten from http://www.cs.umb.edu/~laur/Java/Solitaire/Solitaire.java
			 g.setColor(Color.blue);//sets the color for the next oval 
	         g.fillOval(0, 0, 100, 100);//fills the oval							horizontal, vertical, width. height
	         g.setColor(Color.BLACK);//sets color to black
	         g.drawOval(0, 0, 100, 100);//draws the outlive to oval					horizontal, vertical, width. height

	       //  g.drawArc(25, 35, 50, 50, 180, 180);

    
			 
	}}
