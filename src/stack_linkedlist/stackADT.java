package stack_linkedlist;

/**
 *
 * @author javadaminkp
 */
public class stackADT {

    Node head;
    Node Tail;
    int numNodes;

    int value;

    stackADT() {
        head = null;
        numNodes = 0;
    }

    boolean isEmpty() {

        return head == null;
    }

    void Push(int d) {

        Node temp = new Node(d);

        if (isEmpty()) {

            head = temp;

        } else {

            Node travler = null;
            travler = head;
            while (travler.next != null) {
                travler = travler.next;
            }

            travler.next = temp;
            temp = Tail;

        }
        numNodes++;
    }

    int Pop() {

        if (!isEmpty()) {

            Node ptr, ptr1;       // ptr1 always points to the Node
            // before the one pointed to by ptr

            ptr1 = head;          // ptr1 points to first node
            ptr = head.next;     // ptr points to node following ptr1              

            while (ptr.next != null) {
                ptr1 = ptr;        // Move to next pair of node
                ptr = ptr.next;
            }

            // ******************************************************
            // ptr  NOW points to the last Node in list
            // ptr1 NOW points to the Node BEFORE the last Node
            // ****************************************************** 
            value = ptr.Data;    // Save the the value in last Node 
            // (in case you want to return it)

            ptr1.next = null;
            numNodes--;

        } /*
        int pointer;
        
        if(!isEmpty()){ 
            
             if(head != Tail ) {  
                Node current = head;  
                //Loop through the list till the second last element such that current.next is pointing to tail  
                while(current.next != Tail) {  
                    current = current.next;  
                }  
                //Second last element will become new tail of the list 
            
                Tail = current;  
                Tail.next = null;  
                numNodes--;
            }  
             
            //If the list contains only one element  
            //Then it will remove it and both head and tail will point to null  
            else {  
                head = Tail = null;  
            }  
        } 
        

         */ else {

            System.out.println("Stack is Empty");
        }

        return value;

    }

    void Display() {
        Node t = head;
        System.out.println("\nTotal Number of no Nodes in Stack : " + numNodes);

        while (t != null) {
            System.out.print(t.Data+" -->");
            t = t.next;
        }
     
    }

}
