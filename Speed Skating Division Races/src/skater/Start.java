package skater;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*Mandy Redford
 * window pops up and asks for user to select a gender then goes on to that genders class
 * 	
 */

public class Start {

	static JFrame open = new JFrame ("What is your gender?");
	
	static JPanel p1 = new JPanel();
	static JButton bFemale = new JButton("Female");
	static JButton bmale = new JButton("Male");
	
	
static void begin (){
		opening();}

private static  void opening(){// opens first window
		
		open.setVisible(true);
		open.setSize(300, 400);
		open.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		open.setAlwaysOnTop(true);
		open.setLocationRelativeTo(null);
		
		bFemale.addActionListener(new ActionListener(){//if start button is pressed then....

public void actionPerformed(ActionEvent e){//asks to start game
		open.dispose();
		GirlDivisions.OneFrame();
		
		DrawingFemale a=new DrawingFemale();
		
		JFrame female;
		female= new JFrame ();
		female.setSize(100,150);
		female.setTitle("Girl");
		female.setVisible(true);
		female.setLocation(600 ,400);
		female.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		female.add(a);
		
						}
						});
		
		bmale.addActionListener(new ActionListener(){//if start button is pressed then....

public void actionPerformed(ActionEvent e){//asks to start game
		open.dispose();
		BoyDivision.OneFrame();
		
		DrawingMale a=new DrawingMale();
		
		JFrame male;
		male= new JFrame ();
		male.setSize(100,150);
		male.setTitle("Boy");
		male.setVisible(true);
		male.setLocation(865 ,400);
		male.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		male.add(a);
						}
						});
					 
		p1.add(bFemale);
		p1.add(bmale);
				
		open.add(p1, BorderLayout.CENTER);
						}		 

	}
