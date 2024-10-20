package LeetCodeSolutions.JavaSolutions;
//Node class of Node object
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListInsertion {
    static Node insertAtStart(Node head,int data){
        // create a new node with data
        Node new_node = new Node(data);
        new_node.next = head;
        return new_node;
    }
    //insert after specific key
    static Node insertBeforeKey(Node head, int key, int data){
        Node curr = head;
        // Iterate over Linked List to find the key
        while (curr != null) {
            if (curr.data == key)
                break;
            curr = curr.next;
        }
        if (curr == null)
            return head;
        Node newNode = new Node(data);
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
    public static void printNodes(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(" "+curr.data);
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(7);
        head.next.next = new Node(8);
        head.next.next.next = new Node(12);
        //head = insertAtStart(head,90);
        head = insertBeforeKey(head,7,0);
        printNodes(head);
    }
}
