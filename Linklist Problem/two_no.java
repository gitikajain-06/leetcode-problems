import java.util.Scanner;

public class Main {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);

        ListNode current = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            int digit = sum % 10;

            carry = sum / 10;

            current.next = new ListNode(digit);

            current = current.next;
        }

        return dummy.next;
    }

    public static ListNode createList(Scanner sc, int n) {

        ListNode head = null;
        ListNode tail = null;

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    public static void printList(ListNode head) {

        System.out.print("Output: [");

        while (head != null) {

            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(",");
            }

            head = head.next;
        }

        System.out.println("]");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes in first list: ");
        int n1 = sc.nextInt();

        System.out.println("Enter first list elements:");
        ListNode l1 = createList(sc, n1);

        System.out.print("Enter number of nodes in second list: ");
        int n2 = sc.nextInt();

        System.out.println("Enter second list elements:");
        ListNode l2 = createList(sc, n2);

        ListNode result = addTwoNumbers(l1, l2);

        printList(result);

        sc.close();
    }
}