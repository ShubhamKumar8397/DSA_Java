package linkedList;

public class day2Questions {
    public static class NodeList{
        int val;
        NodeList next;

        public NodeList(int val){
            this.val = val;
        }

    }
    
    static void display(NodeList head){
        NodeList temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    // Delete a Node , from linked list 
    // When The Node itself is pass , node is not tail
    static void deleteItselfNode(NodeList deleteNode){
        deleteNode.val = deleteNode.next.val;
        deleteNode.next = deleteNode.next.next;
    }

    public static void main(String [] args){
        NodeList a = new NodeList(3);
        NodeList b = new NodeList(50);
        NodeList c = new NodeList(55);
        NodeList d = new NodeList(78);
        NodeList e = new NodeList(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        display(a);

        deleteItselfNode(a);
        display(a);


    }


}
