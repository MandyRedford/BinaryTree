package lists;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class delete {
	
	static void works(LinkedList<String> list){
	System.out.println("Delete");
	
	//Got the do while loop from http://stackoverflow.com/questions/2622725/how-to-take-user-input-in-array-using-java modified to fit my program and asignment
	      
	    Scanner stdin = new Scanner(System.in);
	  
	    //while the statement is true or yes keep asking if the want to delete more items to the list
	        do {
	            System.out.println("Current list is " + list);
	            System.out.println("Delete an Item? (y/n)");
	            if (stdin.next().startsWith("y")) {
	                System.out.println("Enter : ");
	                list.remove(stdin.next());
	            } else {
	                break;
	            }
	        } while (true);

	        System.out.println("List is " + list);
	        String[] arr = list.toArray(new String[0]);
	      
	        //ask if satisfied with the list then finish program if not as what the wish to do then go there
	        do{
	        System.out.println("Are you satisfied with the list? (y/n)");
            if (stdin.next().startsWith("y")) {
            	JFrame end = new JFrame ("final list");
            	end.setVisible(true);
            	end.setSize(300, 400);
            	end.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	end.setAlwaysOnTop(true);
            	end.setLocationRelativeTo(null);
            	end.add(new JLabel("Final " + list));
            	
            	//file out the finished list
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
      				outStream.println(list);}

      			outStream.close();  
               
      			//Modify list
            } else if (stdin.next().startsWith("n")) {
            	System.out.println("Do you wishh to add or delete?");
            		if (stdin.next().startsWith("a")) {
	                add.works(list);
	            }	 else if (stdin.next().startsWith("d")) {
	            	delete.works(list);
	            } 	else {
	            		break;
	            }
            		} while (true);
	        } while (true);

}}