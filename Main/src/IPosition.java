/**
 * @author Thabang Mamoloko
 */

/**
 * Interface contains methods for the functionality of the Stack Based Doubly Linked List
 */
public interface IPosition<E> {
	/**
	 * This method adds an element at the top of the list
	 * @param element to add
	 * @return Node
	 */
	Node<E> push(E element);
	
	
	/**
	 * Function removes and returns the element at the top of the stack
	 * @return the removed element/ Node
	 */
	Node<E> pop();
	
	
	/**
	 * Function returns the element at the top of the  without removing it
	 * @return element E at the top
	 */
	E top();
	
	
	// Auxiliary Methods
	/**
	 * Function to determine the size of the list
	 * @return the size of the list
	 */
	int size();
	
	
	/**
	 * Function determines whether the list is empty
	 * @return true if empty/ false if not empty
	 */
	boolean isEmpty();

}
