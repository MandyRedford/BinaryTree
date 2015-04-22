package lists;

import java.util.LinkedList;
import java.util.Scanner;


public class add {
	
	static void works(LinkedList ll){
	System.out.println("Add");
	
	Scanner myScanner=new Scanner(System.in);
	String division;
	division=myScanner.next();
	ll.add(division);
	System.out.println(ll);

}}
