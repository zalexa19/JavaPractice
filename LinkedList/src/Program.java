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
		
		LinkedList a = new LinkedList();
		
		a.addItem("A");
		a.addItem("Weh");
		a.addItem("cat");
		
		a.printer();
		
	}

}
