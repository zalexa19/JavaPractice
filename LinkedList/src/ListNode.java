
public class ListNode {
	
	
	private String value;
	private ListNode next;
	private ListNode prev; 

//Constructors	
	
	
	
	
//Getters and Setters for controling the value.
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	public ListNode getPrev() {
		return prev;
	}

	public void setPrev(ListNode prev) {
		this.prev = prev;
	}

}
