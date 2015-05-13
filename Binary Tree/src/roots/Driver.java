package roots;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver{
	
	//got help from http://www.sanfoundry.com/java-program-implement-binary-search-tree/
		//and our book JAva how to program 10 edition
	
    public static void main(String[] args) throws ParseException{                 
       Scanner scan = new Scanner(System.in);
       
       // Creating object of BST 
       operations bst = new operations(); 
       char ch;
      
       //  Perform tree operations  
        
       do {
    		   System.out.println("Binary Search Tree Operations");
    		   System.out.println("1. insert ");
    		   System.out.println("2. delete");
    		   System.out.println("3. search");
    		   System.out.println("4. count nodes");
 
    	   int choice = scan.nextInt();    
           switch (choice) {
           case 1 : 
               System.out.println("Enter integer to insert");
               bst.insert( scan.nextInt() );                     
               break;                          
           case 2 : 
               System.out.println("Enter integer to delete");
               bst.delete( scan.nextInt() );                     
               break;                         
           case 3 : 
               System.out.println("Enter integer to search");
               System.out.println("Search result : "+ bst.search( scan.nextInt() ));
               break;
           case 4 : 
               System.out.println("Nodes = "+ bst.countNodes());
               break;   
           default : 
               System.out.println("Invalid Entry, Try again \n ");
               break;   
           }
           
           //  Display tree  
           System.out.print("\nPost order : ");
           bst.postorder();
           System.out.print("\nPre order : ");
           bst.preorder();
           System.out.print("\nIn order : ");
           bst.inorder();
           System.out.print("\nReverse order : ");
           bst.reverse();

           System.out.println("\nDo you want to continue (Type y or n) \n");
           ch = scan.next().charAt(0);                        
       } while (ch == 'Y'|| ch == 'y');               
   }
}