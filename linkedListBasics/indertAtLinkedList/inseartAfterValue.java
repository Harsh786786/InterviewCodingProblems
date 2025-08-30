public class inseartAfterValue {
    public static void main(String[] args) {
        
    }

    public static Node insertAfter(Node head, int key, int newData) {

        // Initialize curr Pointer to head
        Node curr = head;
        
        // Iterate over Linked List to find the key
        while (curr != null) {
            if (curr.data == key)
                break;
            curr = curr.next;
        }

        // If curr becomes null means, given key is not
        // found in linked list
        if (curr == null) {
            System.out.println("Node not found");

            // Return the head of the original linked list
            return head;
        }

        // Allocate new node and make the element to be
        // inserted as a new node
        Node newNode = new Node(newData);

        // Set the next pointer of new node to the next
        // pointer of given node
        newNode.next = curr.next;

        // Change the next pointer of given node to the 
        // new node
        curr.next = newNode;

        // Return the head of the modified linked list
        return head;
    }
}
