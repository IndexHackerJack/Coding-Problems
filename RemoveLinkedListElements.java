package LeetCode;

/**
 * Created by jackli on 2018-10-10.
 * <p>
 * https://leetcode.com/problems/remove-linked-list-elements/description/
 */
public class RemoveLinkedListElements
{
    public static ListNode removeElements(ListNode head, int targetVal)
    {
        if (head == null)
        {
            return null;
        }

        ListNode previous = null;
        ListNode current = head;
        while (current != null)
        {
            if (current.val == targetVal)
            {
                if (previous == null)
                {
                    // Deleting head node
                    ListNode nextNode = current.next;
                    current.next = null;
                    current = nextNode;
                    head = nextNode;
                }
                else
                {
                    // We are deleting a node that is not the head
                    previous.next = current.next;
                    current = current.next;
                }
            }
            else
            {
                previous = current;
                current = current.next;
            }
        }

        return head;
    }

    public static void printLinkedList(ListNode root)
    {
        if (root == null)
        {
            return;
        }

        ListNode current = root;
        while (current != null)
        {
            System.out.println(current.val);

            current = current.next;
        }
    }

    public static void main(String[] args)
    {
//        ListNode root = new ListNode(6);
//        ListNode sixB = new ListNode(6);
//        ListNode seven = new ListNode(7);
//        ListNode five = new ListNode(5);
//        ListNode sixC = new ListNode(6);
//        root.next = sixB;
//        sixB.next = seven;
//        seven.next = five;
//        five.next = sixC;
//
//        System.out.println("***Before***");
//        printLinkedList(root);
//
//        System.out.println();
//        System.out.println("***After***");
//        ListNode resultHead = removeElements(root, 6);
//        printLinkedList(resultHead);


//        System.out.println();
//        System.out.println("***Before***");
//        printLinkedList(null);
//
//        System.out.println();
//        System.out.println("***After***");
//        ListNode bResultHead = removeElements(null, 6);
//        printLinkedList(bResultHead);


        ListNode root = new ListNode(8);
        ListNode bEight = new ListNode(8);
        ListNode cEight = new ListNode(8);
        root.next = bEight;
        bEight.next = cEight;

//        System.out.println();
//        System.out.println("***Before***");
//        printLinkedList(root);
//
//        System.out.println();
//        System.out.println("***After***");
//        ListNode resultHead = removeElements(root, 8);
//        printLinkedList(resultHead);

//        System.out.println();
//        System.out.println("***Before***");
//        printLinkedList(root);
//
//        System.out.println();
//        System.out.println("***After***");
//        ListNode resultHead = removeElements(root, 9);
//        printLinkedList(resultHead);
    }
}

class ListNode
{
    int val;
    ListNode next;

    ListNode(int x)
    {
        val = x;
    }
}