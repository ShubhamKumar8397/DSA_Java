package linkedList;

public class day2Questions {
    public static class NodeList {
        int val;
        NodeList next;

        public NodeList(int val) {
            this.val = val;
        }

    }

    static void display(NodeList head) {
        NodeList temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Question 1
    // Delete a Node , from linked list
    // When The Node itself is pass , node is not tail
    static void deleteItselfNode(NodeList deleteNode) {
        deleteNode.val = deleteNode.next.val;
        deleteNode.next = deleteNode.next.next;
    }

    // Question - 2
    // Get The Nth Node from Last, return nth node
    static NodeList getNthNodeFromLast(NodeList head, int nth) {
        NodeList slow = head;
        NodeList fast = head;

        for (int i = 1; i <= nth; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(slow.val);
        return slow;
    }

    // Question -3
    // Removing The nth Node from last from The Linkedlist
    // only head is given

    // Question -4
    // Find The Intersection of The Two Linkedlist
    // find size of first ll and second ll

     static NodeList findIntersection(NodeList headA, NodeList headB) {
        NodeList tempA = headA;
        NodeList tempB = headB;

        int sizeListA = 0;
        int sizeListB = 0;

        while (tempA != null) {
            tempA = tempA.next;
            sizeListA++;
        }

        while (tempB != null) {
            tempB = tempB.next;
            sizeListB++;
        }
         tempA = headA;
         tempB = headB;

        int moveValue = Math.abs(sizeListA - sizeListB);

        if (sizeListA > sizeListB) {
            for(int i = 1; i <= moveValue; i++){
                tempA = tempA.next;
            }
        }else{
            for(int i = 1; i <= moveValue; i++){
                tempB = tempB.next;
            }
        }

        NodeList answer =  null ;

        while(tempA != null && tempB != null){
            if(tempA == tempB){
                answer = tempA;
                break;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return answer;

    }

    public static void main(String[] args) {
        NodeList a = new NodeList(3);
        NodeList b = new NodeList(50);
        NodeList c = new NodeList(55);
        NodeList d = new NodeList(78);
        NodeList e = new NodeList(80);
        NodeList f = new NodeList(85);
        NodeList g = new NodeList(90);
        NodeList h = new NodeList(95);
        NodeList i = new NodeList(100);

        NodeList aa = new NodeList(150);
        NodeList bb = new NodeList(120);
        NodeList cc = new NodeList(110);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;

        aa.next = bb;
        bb.next = cc;
        cc.next = i;

        display(a);

        // deleteItselfNode(a);
        // display(a);
        // System.out.println(e);
        // System.out.println(getNthNodeFromLast(a, 1));

        System.out.println(findIntersection(a , aa));

    }

}
