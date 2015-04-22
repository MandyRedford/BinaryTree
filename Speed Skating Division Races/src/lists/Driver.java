package lists;

import java.awt.BorderLayout;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

//this project lets the user create a list one item at a time and then gives the option to delete an item from the list and then asks if they
// are satisfied with said list or if the want to modify the list
//when the user is satisfied with the list it is then filed

import javax.swing.*;


public class Driver {
	//creat varibles 
	static JPanel p1 = new JPanel();

	static JButton bstart = new JButton("Start");
	
	static LinkedList<String> list = new LinkedList<String>();
	
	public static void main(String[] args) {
		
	
	final JFrame open = new JFrame ("Creat a list");
	open.setVisible(true);
	open.setSize(200, 200);
	open.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	open.setAlwaysOnTop(true);
	open.setLocationRelativeTo(null);
	
	bstart.addActionListener(new ActionListener(){//if start button is pressed then....
		

public void actionPerformed(ActionEvent e){
			open.dispose();
			add.works(list);//goes to where you add items to the list
					}
					});
				 
			p1.add(bstart);//adds button to pannel
			
			open.add(p1, BorderLayout.CENTER);//puts panel on location in window

}}
