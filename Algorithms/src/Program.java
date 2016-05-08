import java.util.Scanner;

public class Program {
	
	public static void main (String [] args)
	{
		
		//This is a test
		/*ListNode n1 = new ListNode();
		ListNode n2 = new ListNode();
		ListNode n3 = new ListNode();
		
		n1.setValue("alex");
		n2.setValue("and");
		n3.setValue("stas");
		
		n1.setNext(n2);
		n2.setPrev(n1);
		n2.setNext(n3);
		n3.setPrev(n2);
		
		ListNode temp = n1;
		
		while (temp != null)
		{
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}*/
		/*
		LinkedList<Integer> a = new LinkedList<Integer>();
		
		a.addItem(2);
		a.addItem("Weh");
		a.addItem(7);
		
		a.printer();
		*/
		
		
		//Asking for users input
		
		System.out.println("Hi, Please choose your Data Structure:");
		System.out.println("1. Linked List \n 2.A simple array (not implemented)");
		
		Scanner userInput = new Scanner (System.in);
		
		int selectedDS = userInput.nextInt();
		
		//Choose numbers or Strings
		System.out.println("Choose numbers or strings");
		System.out.println("1. Numbers");
		System.out.println("2. Strings");
		
		int inputType = userInput.nextInt();
		
		System.out.println("Please insert values one by one.");
		System.out.println("Make sure to be consistent.");
		System.out.println("Use a blank insert to stop or -1");
		
		//Selection of the desired Data Structure
		/*LinkedList of type Integer*/
		if (inputType== 1){
			
			if (selectedDS== 1) {
				
				int input = userInput.nextInt();
				LinkedList<Integer> list = new LinkedList<Integer>(); 
				
				
				while (input != -1)
				{
					list.addItem(input);
					input= userInput.nextInt();
					
				}
				
				System.out.println("Finished taking numbers");
				list.printer();
			}
		}
		
		if (inputType==2) {
		//Input is a String
		}
			if (selectedDS==1) 
				//Data Structure is a Linked List
			{
				String input = userInput.next();
				LinkedList<String> list = new LinkedList<String>();
				
				while (input.length() == 0) 
				{
					list.addItem(input);
					input=userInput.next();
					
				}
				System.out.println("Finished taking Strings");
				list.printer();
			}
		}
		
}
		
	

