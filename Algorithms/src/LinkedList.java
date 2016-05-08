
public class LinkedList <T> {
	
	private ListNode<T> head; 
	private ListNode<T> tail;


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
	
	public void addItem (T value){
		
		ListNode<T> newNode = new ListNode<T>();
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
		
		ListNode<T> temp = this.getHead();
		while (temp != null)
		{
			System.out.println(temp.getValue());
			temp=temp.getNext();
		}
	}
	
	
/*Headers and setters*/
	public ListNode<T> getHead() {
		return head;
	}
	public void setHead(ListNode<T> head) {
		this.head = head;
	}
	public ListNode<T> getTail() {
		return tail;
	}
	public void setTail(ListNode<T> tail) {
		this.tail = tail;
	}
		
	

}
