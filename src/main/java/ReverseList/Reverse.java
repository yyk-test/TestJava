package ReverseList;

public class Reverse {
    public static ListNode reverse(ListNode head) {
//        if(head == null || head.next == null) {
//            return head;
//        }

        ListNode prev = null;

        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public static void printList(ListNode head) {
        if(head == null) {
            return;
        }
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
