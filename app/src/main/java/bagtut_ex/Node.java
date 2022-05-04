package bagtut_ex;

public class Node<T> {

	private T value;
	private Node<T> next;
	
	public Node(T value){
		this.value = value;
		this.next = null;
	}
	
	public Node(T value, Node<T> next) {
		this.value = value;
		this.next = next;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return this.value;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node<T> getNext(){
		return this.next;
	}
	
	public boolean hasNext() {
		return next != null;
	}
	
	public String toString() {
		return this.value + "-->" + this.next;
	}
}

