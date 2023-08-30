public class ABCList {

	ABCNode head;

	/*
		Constructor class for ABCList
	*/
	public ABCList(){
		head = null;
	}

	/*
		Method to add char to beginning of ABCList
	*/
	public void add(char c){
		// Create new node
		ABCNode newNode = new ABCNode(c);

		// If there isn't a node in the list
		if(head == null){
			// Set the new node as the head
			head = newNode;
		}
		else {
			// Make new node point to same place as head
			newNode.next = head;
			// Make previous head point to the new node
			head = newNode;
		}
	}

	/*
		Method to search for char in list
	*/
	public boolean has(char c){
		// Create pointer set at head
		ABCNode current = head;
		while(current != null){
			if(current.value == c){
				return true;
			}
			// Set pointer to next node
			current = current.next;
		}
		return false;

	}

	/*
		Method to remove certain value from linked list
	*/
	public void remove(char c){
		// If list is empty, return
		if(isEmpty()){
			return;
		}
		// If the list doesn't contain the value, return
		if(!has(c)){
			return;
		}

		ABCNode previous = null;
		ABCNode current = head;
		// If head contains value
		if (current != null && current.value == c) {
			// Set head to next value
			head = current.next;
			return;
		}

		while (current != null && current.value != c) {
			previous = head;
			head = head.next;
		}

		previous.next = current.next;
	}

	/*
		Method that counts each node of list and returns count
	*/
	public int length(){
		// Initialise count to zero
		int count = 0;
		ABCNode current = head;
		// While we are not at end of list
		while (current != null){
			count++;
			// Set pointer to next node
			current = current.next;
		}
		return count;
	}

	/*
		Method to return true or false depending if list is empty or not
	*/
	public boolean isEmpty(){
		// If list doesn't contain a head ie. empty list
		if(head == null){
			return true;
		}
		return false;
	}
	
	/*
		Method to print value of each node of the list
	*/
	public void dump(){
		// Set pointer to head of list
		ABCNode current = head;
		while (current != null){
			System.out.println(current.value);
			// Set pointer to next node
			current = current.next;
		}
	}

}