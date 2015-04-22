package lists;

import java.util.LinkedList;
import java.util.Scanner;

public class add {
	
	static void works(LinkedList<String> list){
	System.out.println("Add");
	
	//Got the do while loop from http://stackoverflow.com/questions/2622725/how-to-take-user-input-in-array-using-java modified to fit my program and asignment
	    Scanner stdin = new Scanner(System.in);
	    
	    //while the statement is true(yes)keep asking if the want to add more items to the list
	        do {
	            System.out.println("Current list is " + list);
	            System.out.println("Add more? (y/n)");
	            if (stdin.next().startsWith("y")) {
	                System.out.println("Enter : ");
	                list.add(stdin.next());
	            } else {
	                break;//if no exit loop
	            }
	        } while (true);

	        System.out.println("List is " + list);
	        String[] arr = list.toArray(new String[0]); 
	        
	        //ask if the want to delte an item if so then go to delete class
	        do{
	        System.out.println("Do you wish to remove any item?");
	        if (stdin.next().startsWith("y")) {
                delete.works(list);
            } else {
                break;
            }
	        } while (true);
	
	
	}	
}
