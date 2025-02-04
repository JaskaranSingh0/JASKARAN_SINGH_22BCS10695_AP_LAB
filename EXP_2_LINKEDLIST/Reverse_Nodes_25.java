//Problem Number 25- Reverse Nodes in k-Group
 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Reverse_Nodes_25  {
    public ListNode reverseKGroup(ListNode head, int k) {
        int size = length(head); // getting the length of linked list 
        if(k>size){ // checking if k is greater than size ... if it is then return head
            return head;
        }

        ListNode temp = head; // creating a node temp 
        ListNode nextNode = null; // nextNode to store the next group first node 
        ListNode prevNode = null; // to store current group last node 

        while(temp!=null){ // traversing the linked list 
            ListNode kthNode = getKthNode(temp,k); // getting the kth node 
            if(kthNode ==null){
                break; // checking if k is greater than size of linked list 
            }

            nextNode = kthNode.next; // storing nextNode 
            kthNode.next = null; // to reverse the linked list we need to seperate the groups as individual linked list 
            reverse(temp); // reversing the linked list 
            if(temp==head){
                head = kthNode; // to ensure the correct replacement of head ... we are checking this condition cause ... 
                                //for the first time the temp was on head only 
            }else {
                prevNode.next = kthNode; // else join the prevNode with KthNode as kthNode will be the starting point of next group

            }

            prevNode = temp; // shifting the prevNode to temp 
            temp = nextNode; // shifting the temp to nextNode 

        }

        prevNode.next = nextNode;  // at last joining the remaining nodes to prevNode 

        return head;
    }

    public ListNode getKthNode(ListNode head , int k){
        ListNode temp = head;
        int i =0;
        while(temp!=null && i<k-1){
            i++;
            temp = temp.next;
        }

        return temp;

    }

    public ListNode reverse(ListNode head ){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr!=null ){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public int length(ListNode head){
        ListNode temp = head;
        int len =0;
        while(temp!=null){
            len++;
            temp = temp.next;
        }

        return len;
    }
}
