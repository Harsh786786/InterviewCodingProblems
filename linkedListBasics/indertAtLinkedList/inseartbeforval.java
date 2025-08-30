public class inseartbeforval {
    public static void main(String[] args) {
        
    }

//     public static Node insertBefore(Node head, int key, int newData) {
//     // Case 1: Empty list
//     if (head == null) {
//         System.out.println("List is empty");
//         return head;
//     }

//     // Case 2: If key is at the head
//     if (head.data == key) {
//         Node newNode = new Node(newData);
//         newNode.next = head;
//         return newNode; // new node becomes head
//     }

//     // Case 3: Otherwise, search for key
//     Node curr = head;
//     Node prev = null;

//     while (curr != null && curr.data != key) {
//         prev = curr;
//         curr = curr.next;
//     }

//     // Key not found
//     if (curr == null) {
//         System.out.println("Node not found");
//         return head;
//     }

//     // Insert before curr
//     Node newNode = new Node(newData);
//     prev.next = newNode;
//     newNode.next = curr;

//     return head;
// }

}
