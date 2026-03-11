/**
 * @author Thabang Mamoloko
 */

/**
 * Blueprint for Nodes in the Doubly Linked List
 */
public class Node<E> {
	private E element;
	private Node<E> prev;
	private Node<E> next;
	/**
	 * @param element
	 * @param prev
	 * @param next
	 */
	public Node(E element, Node<E> prev, Node<E> next) {
		this.element = element;
		this.prev = prev;
		this.next = next;
	}
	/**
	 * @return the element
	 */
	public E getElement() {
		return element;
	}
	/**
	 * @param element the element to set
	 */
	public void setElement(E element) {
		this.element = element;
	}
	/**
	 * @return the prev
	 */
	public Node<E> getPrev() {
		return prev;
	}
	/**
	 * @param prev the prev to set
	 */
	public void setPrev(Node<E> prev) {
		this.prev = prev;
	}
	/**
	 * @return the next
	 */
	public Node<E> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node<E> next) {
		this.next = next;
	}

}
