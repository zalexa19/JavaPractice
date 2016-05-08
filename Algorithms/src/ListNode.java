
public class ListNode <T> {
	
	
	private T value;
	private ListNode<T> next;
	private ListNode<T> prev; 

//Constructors	
	
	
	
	
//Getters and Setters for controling the value.
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public ListNode<T> getNext() {
		return next;
	}

	public void setNext(ListNode<T> next) {
		this.next = next;
	}

	public ListNode<T> getPrev() {
		return prev;
	}

	public void setPrev(ListNode<T> prev) {
		this.prev = prev;
	}

}
