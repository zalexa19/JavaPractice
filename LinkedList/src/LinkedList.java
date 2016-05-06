
public class LinkedList {
	
	private ListNode head; 
	private ListNode tail;


/*Methods*/
	
	/*This method checks if the list is empty by checking the head value*/
	
	public boolean isEmpty (){
		if (this.getHead() == null)
		{
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public void addItem (String value){
		
		ListNode newNode = new ListNode();
		newNode.setValue(value); //Set the value
		
		//Check if the header is empty
		if (this.isEmpty()) {
			this.setHead(newNode);
			this.setTail(newNode);
		}
		
		else {
			this.getTail().setNext(newNode);
			newNode.setPrev(this.getTail());
			this.setTail(newNode);
		}
	
	}
	
	/*Printers*/
	
	public void printer (){
		
		ListNode temp = this.getHead();
		while (temp != null)
		{
			System.out.println(temp.getValue());
			temp=temp.getNext();
		}
	}
	
	
/*Headers and setters*/
	public ListNode getHead() {
		return head;
	}
	public void setHead(ListNode head) {
		this.head = head;
	}
	public ListNode getTail() {
		return tail;
	}
	public void setTail(ListNode tail) {
		this.tail = tail;
	}
		
	

}
