public class OrderedABCList extends ABCList {

	/*
		Method that adds character ordered alphabetically into list
	*/
	public void insert(char c){
		// Create a new node
		ABCNode newNode = new ABCNode(c);
		// Create pointer set at head
		ABCNode current = head;
		
		// If head is null OR the value of head is greater than the newNode value
		if (head == null || head.value >= newNode.value) {
			// Set next node to head
			newNode.next = head;
			// Set head to newNode
			head = newNode;
			return;
		}

		// While next node isn't null AND the next node value is less than newNode value
		while (current.next != null && current.next.value < newNode.value) {
			// Move pointer to next node
			current = current.next;
		}
		// Point newNode at node after pointer
		newNode.next = current.next;
		current.next = newNode;

	}

	/*
		Method to override add method from ABCList.java
	*/
	public void add(char c) {
		System.out.println("Whoops, an ordered list does not include an 'add' method. Please use 'insert' instead");
	}
}