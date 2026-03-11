/**
 * @author Thabang Mamoloko
 */

/**
 * Class implements IPosition methods
 */
public class PositionalList<E> implements IPosition<E>{
	private Node<E> header = null;
	private Node<E> trailer = null;
	private int size = 0;

	@Override
	public Node<E> push(E element) {
		// TODO Auto-generated method stub
		Node<E> newNode = new Node<>(element, null, header);
		if(isEmpty()) {
			trailer = newNode;
		}else {
			header.setPrev(newNode);
		}
		header = newNode;
		size++;
		return newNode;
	}

	@Override
	public Node<E> pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new IllegalArgumentException("Header is null");
		}
		header = header.getNext();
		return header;
	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new IllegalArgumentException("Header is null");
		}
		return header.getElement();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}
	
	public void printList() {
		Node<E> current = header;
		while(current != null) {
			System.out.print(current.getElement() + " <-> ");
			current = current.getNext();
		}
		System.out.println("null");
	}

}
