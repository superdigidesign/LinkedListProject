//imports for Scanner and List classes and methods
import java.util.Scanner;
import java.util.*;

class LinkedListOfEmployees {
	
	//main method
		public static void main (String[] args) {
			
			//scanner
			Scanner keyInput = new Scanner(System.in); 
			
			int userInput = 0;
			int exit = 0;
			
			//Title on page
			System.out.println("---------"+"  Single LinkedList  "+"---------"+"\n");	
			
			//start of list of options for user
			System.out.println("Enter '1' to add a new employee.");						
			System.out.println("Enter '2' for a total of the male and female employees.");			
			System.out.println("Enter '3' to see the name of the oldest employee.");					
			System.out.println("Enter '4' to see all the employees of a given gender.");					
			System.out.println("Enter '5' to see all the male employees.");						
			System.out.println("To exit program enter '0'"+"\n");					
			System.out.println("Enter your choice here: ");			
			
			//user keyboard input
			userInput = keyInput.nextInt();        
			
			//User exit option
			if(exit==0) {
				System.out.println("Goodbye!");		
			}else {
				System.out.println("Please select an option between 0 and 5");
				
				//constructors
				Node<Integer> head = new Node<Integer>(emID);
				Node<String> second = new Node<String>(name);
				Node<String> third = new Node<String>(gender);
				Node<Integer> fourth = new Node<Integer>(age);
				
				//add elements to LinkedList
				theList.add("Peter");
				theList.add("Paul");
				theList.add("Sarah");
				theList.add("Sue");
				theList.add("Chris");
						
			}
		}
	
			
		//method calls
		
		

		//head node to hold the list
	private Node head;
		

		//Attach together to form a list
		
	public LinkedListOfEmployees() {
		head = null;
	}
	
	//This method inserts at the front of the linked list
	public void insertAtFront(Employee e) {
	//TODO
	
}

	public void insertAtEnd(Employee e) {
		//TODO
		//This method inserts at the end of the linked list
	}
	
	public int countEmployees(String g) {
		//TODO
		//This method returns number of employees who are of gender g
	}
	Employee getOldestEmployee() {
		//TODO
		//This method returns the oldest employee.
	}
	
	public LinkedListOfEmployees getEmployees(String g) {
		//TODO
		//This method returns a linked list of employees who are of gender g
	}
	
	public void split(LinkedListOfEmployees male, LinkedListOfEmployees female) {
		//TODO
		//This method inserts all male employees into a linked list of male and female into female linked list
	}
	
	public void display() {
		//TODO
		//displays the data of each employee in the linked list
	}
	
	
	
	keyInput.close();  //close scanner
}
