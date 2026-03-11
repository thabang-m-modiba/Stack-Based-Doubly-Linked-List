/**
 * @author Thabang Mamoloko
 */

/**
 * Class contains the main method
 * 
 */
public class Main {

	/**
	 * The main method
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositionalList<Integer> list = new PositionalList<>();
		
		list.push(1);
		list.push(2);
		list.printList();
		list.pop();
		list.printList();
	}

}
