# Question Dry Run And Approach

## Question 1 

<img src="../Docs/linkedList/6.jpeg" alt="Question1" width="90%">
Jo Node Address Diya haii Usi, Node ko delete krna haii , agle wale ki replica bna do khud ko , aur agle wale ko hta do 

### dry Run + Approach
<img src="../Docs/linkedList/deleteCurrentNode.png" alt="Question1" width="70%">

```java
    static void deleteItselfNode(NodeList deleteNode){
        deleteNode.val = deleteNode.next.val;
        deleteNode.next = deleteNode.next.next;
    }
```
- We can't Delete The tail, head to last node -1 tak delete kr sakte haii

