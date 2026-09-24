package linkedList;

public class day1Basics {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        // To append Element at last, in linkedList , either linked list is empty or
        // having elements
        void appendElement(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        // To append Element in linkedList , either linked list is empty or having
        // elements
        void appendElementAtStart(int data) {
            if (head == null) {
                appendElement(data);
                return;
            }
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            size++;
        }

        // Find The Nth Node From Last of the Node , 
        // if Only Head is given

        // Get Element of Any Index (0 based indexing);
        int getElement(int index) {
            if (index < 0) {
                System.out.println("Invalid Index !");
                return -1;
            }
            if (index >= size) {
                System.out.println("Index Out of bound!");
                return -1;
            }
            Node temp = head;
            if (index == 0) {
                return temp.data;
            } else {
                for (int i = 1; i <= index; i++) {
                    temp = temp.next;
                }
            }

            return temp.data;
        }

        // insert element at any index
        void insertAtIndex(int index, int data) {
            if (index == 0) {
                appendElementAtStart(data);
                return;
            }
            if (index == size) {
                appendElement(data);
                return;
            }
            Node temp = head;
            Node newNode = new Node(data);
            for (int i = 1; i <= index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;

        }

        // delete element of any index
        void deleteAtIndex(int index) {
            Node temp = head;
            if (index < 0) {
                System.out.println("Invalid Index");
            } else if (index >= size) {
                System.out.println("Index Out of Bound");

            } else if (index == 0) {
                head = temp.next;
                if (head == null) { // if only one element present , list now empty so tail empty
                    tail = null;
                }
                size--;

            } else if (index == size - 1) {
                for (int i = 1; i <= index - 1; i++) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                size--;
            } else {
                for (int i = 1; i <= index - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }


        // function to print reverse linkedlist
        void reverseLinkedList(Node head) {
            if (head.next == null) {
                System.out.print(head.data + " ");
                return;
            }
            reverseLinkedList(head.next);
            System.out.print(head.data + " ");

        }


        void printReverse() {
            System.out.println();
            Node temp = head;
            reverseLinkedList(temp);
            System.out.println();
        }


        // function to reverse the linked list
        void reverse() {
            Node prev = null;
            Node curr = head;
            tail = head; // old head becomes new tail
            while (curr != null) {
                Node nextTemp = curr.next; // save next before overwriting
                curr.next = prev; // reverse the pointer
                prev = curr; // move prev forward
                curr = nextTemp; // move curr forward
            }
            head = prev; // prev ends up at the old last node
        }

        // function to display linkedList
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            return size;
        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.appendElementAtStart(90);
        ll.appendElementAtStart(85);
        ll.appendElementAtStart(80);
        ll.appendElement(50);
        ll.appendElement(55);
        ll.appendElement(60); // 80 85 90 50 55 60
        ll.display();
        // System.out.println(ll.getElement(7));

        ll.insertAtIndex(3, 95);
        ll.display();

        System.out.println("delete element");
        ll.deleteAtIndex(2);
        ll.deleteAtIndex(0);
        ll.deleteAtIndex(4);
        ll.display();
        System.out.println(ll.size());

        ll.reverse();
        ll.display();
    }

}
