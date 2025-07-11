class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data; //set node value
        this.next = null; //next node is initially

        ///this is a constructor that takes param int data
        /// this.data takes in data of the node
        /// this.next = null initializes the next pointer to null
        /// ^ this is done to connect the next node to the list
    }
}

class SignlyLinkedList{
    Node head;

    void add(int data){
        Node newNode = new Node(data);//create new node
        if(head == null){
            head = newNode; // set head if list if empty
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;// transverse to last node
            }
            current.next = newNode; //add new node at the end
        }
        /** head var keeps trac of first node in list
         add void function creates a new node and if the head is empty
         give the head a new node which is the first on the list
         else: head becomes node current
         while traversing through current, keep going until its empty.
         current = current.next; means transverse to last node
         current.next = newNode // means adding a new node at the end
         */
    }

    void printList(){
        Node current = head;
        while(current != null) {  // while list is not empty
            System.out.println(current.data); //print data
            current = current.next;// go to the next node
    }
/** current becomes the front of the list
 * while current is not empty
 * print out the data in current
 * set current to the next node
 */
    }

    public static void main(String[] args) {
        SignlyLinkedList list = new SignlyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.printList();
    }
}