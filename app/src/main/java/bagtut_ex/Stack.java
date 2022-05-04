package bagtut_ex;

public class Stack<T> {

	private Node<T> head;

	public Stack() {
		this.head = null;
	}

	public void push(T x) {
		Node<T> temp = new Node<T>(x);
		temp.setNext(this.head);
		this.head = temp;
	}
	
	public T pop() {
		T temp = head.getValue();
		head = head.getNext();
		return temp;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public T top() {
		return head.getValue();
	}
	
	public String toString() {
		return head.getValue() + "-> " + head.getNext();
	}
	
}

