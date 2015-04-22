package lists;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;


public class Driver {

	static LinkedList<String> ll = new LinkedList<String>();	

	static JFrame open = new JFrame ("Races for next meet");
		
	static JPanel p1 = new JPanel();
	static JButton badd = new JButton("Add");
	static JButton bdelete = new JButton("Delete");

	public static void main(String[] args) { 
		
			opening();}

	private static  void opening(){// opens first window
			
			open.setVisible(true);
			open.setSize(300, 400);
			open.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			open.setAlwaysOnTop(true);
			open.setLocationRelativeTo(null);
			
			badd.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent e){
			open.dispose();
			add.works(ll);
			
							}
							});
			
			bdelete.addActionListener(new ActionListener(){
				

	public void actionPerformed(ActionEvent e){
			open.dispose();
			new search();
			
							}
							});
						 
			p1.add(badd);
			p1.add(bdelete);
					
			open.add(p1, BorderLayout.SOUTH);
							}		 

		
	
}
