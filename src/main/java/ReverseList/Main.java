package ReverseList;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        for(int i = 1; i <= 10; i++) {
            head.next = new ListNode(i);
            head = head.next;
        }

        System.out.println("Before: ");
        Reverse.printList(dummy.next);
        ListNode newHead = Reverse.reverse(dummy.next);
        System.out.println("\nAfter: ");
        Reverse.printList(newHead);
    }

}
