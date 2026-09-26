# Day 3 - Questions

## Question No - 4
<img src="../Docs/linkedList/11.jpeg" alt="Question1" width="90%">

These Questions Dry Run Must<br> 
First try on pen paper then write code <br>
Constraints -> as per leetcode
- if LL is head only
- Leetcode Question 876
<img src="../Docs/linkedList/Approach-Question4.png" alt="Question1" width="90%">

```java
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
```

<img src="../Docs/linkedList/dryrun1-Question-4.png" alt="Question1" width="90%">


<img src="../Docs/linkedList/Dryrun2-Question-4.png" alt="Question1" width="90%">


<img src="../Docs/linkedList/overallidea-Question-4.png" alt="Question1" width="90%">


## Question 5

<img src="../Docs/linkedList/12.jpeg" alt="Question1" width="90%">
<img src="../Docs/linkedList/13.jpeg" alt="Question1" width="90%">
<img src="../Docs/linkedList/14.jpeg" alt="Question1" width="90%">