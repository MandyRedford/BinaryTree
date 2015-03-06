package skater;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/*Mandy Redford
 * for boy gender selection offers for you to choose your division then outputs in console what distances you race
 * 	
 */

public class BoyDivision implements ActionListener {

	private static JComboBox<String> divisions;
	//private static JComboBox<String> Race;
	
	public static void OneFrame(){
	//Divisions
	final String[] names={"Tiny Tot", "Primary", "Juvienile","Elementry" , "Freshmen", "Sophmore", "Junior","Senior", "Classic"};
		
		divisions=new JComboBox<String>(names);
		divisions.setMaximumRowCount(8);

	//frame	
	JFrame divframe;
	divframe= new JFrame ();
	divframe.setSize(100,500);
	divframe.setTitle("Boy");
	divframe.setVisible(true);
	divframe.setLocationRelativeTo(null);
	divframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	divframe.setLayout(new FlowLayout());//makes it so i can have all display at ounce
			
	divframe.add(divisions);
	//divframe.add(Race);
	 
	divisions.addActionListener(new ActionListener(){

	 @SuppressWarnings("rawtypes")
	public void actionPerformed(ActionEvent e) {
		 JComboBox cb = (JComboBox)e.getSource();
		  String divisions = (String)cb.getSelectedItem();
		 
		  //updateLabel(divisions);
		  if (divisions==names[0]){
			  System.out.println( names[0]+ " Ages 5 & under ");
			  System.out.println("Distances = ");
			  System.out.println("100");
			  System.out.println("200");
			  System.out.println("300");
			  }
		  else if (divisions==names[1]) {
			  System.out.println( names[0]+ " Ages 6-7 ");
			  System.out.println("Distances = ");
			  System.out.println("200");
			  System.out.println("300");
			  System.out.println("400");
		  }
		  else if (divisions==names[2]) {
			  System.out.println( names[0]+ " Ages 8-9 ");
			  System.out.println("Distances = ");
			  System.out.println("200");
			  System.out.println("300");
			  System.out.println("500");
		  }
		  
		  else if (divisions==names[3]) {
			  System.out.println( names[0]+ " Ages 10-11 ");
			  System.out.println("Distances = ");
			  System.out.println("300");
			  System.out.println("500");
			  System.out.println("700");
		  }
		  else if (divisions==names[4]) {
			  System.out.println( names[4]+ " Ages 12-13 ");
			  System.out.println("Distances = ");
			  System.out.println("300");
			  System.out.println("500");
			  System.out.println("1000");
		  }
		  else if (divisions==names[5]) {
			  System.out.println( names[5]+ " Ages 14-15 ");
			  System.out.println("Distances = ");
			  System.out.println("500");
			  System.out.println("1000");
			  System.out.println("1500");
		  }
		  else if (divisions==names[6]) {
			  System.out.println( names[6]+ " Ages 16-17 ");
			  System.out.println("Distances = ");
			  System.out.println("500");
			  System.out.println("1000");
			  System.out.println("2000");
		  }
		  else if (divisions==names[7]) {
			  System.out.println( names[7]+ " Ages 18+ ");
			  System.out.println("Distances = ");
			  System.out.println("500");
			  System.out.println("1000");
			  System.out.println("3000");
		  }
		  else if (divisions==names[8]) {
			  System.out.println( names[8]+ " Ages 25+ ");
			  System.out.println("Distances = ");
			  System.out.println("500");
			  System.out.println("1000");
			  System.out.println("2000");
		  }
		  
		  File logfile = new File("mylog.txt");
			FileOutputStream outFileStream = null;
			try {
				outFileStream = new FileOutputStream(logfile);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			PrintWriter outStream = new PrintWriter(outFileStream);
			for (int k=0; k<1; k++) {
				int i= 0;
				outStream.println("boys" + (names[i]));}

			outStream.close();  
		  
		  
	 }
	});
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}}