package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jackli on 2018-10-11.
 * <p>
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
 */
public class RemoveDuplicatesFromSortedList
{
    public static ListNode deleteDuplicates(ListNode head)
    {
        Set<Integer> alreadySeen = new HashSet<>();

        ListNode initial = new ListNode(0);
        initial.next = head;
        ListNode current = initial;
        while (current.next != null)
        {
            if (alreadySeen.contains(current.next.val))
            {
                current.next = current.next.next;

            }
            else
            {
                alreadySeen.add(current.next.val);
                current = current.next;
            }
        }

        return initial.next;
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

//        System.out.println("***Before***");
//        printLinkedList(root);
//
//        System.out.println();
//        System.out.println("***After***");
//        ListNode resultHead = deleteDuplicates(root);
//        printLinkedList(resultHead);


//        System.out.println();
//        System.out.println("***Before***");
//        printLinkedList(null);
//
//        System.out.println();
//        System.out.println("***After***");
//        ListNode bResultHead = deleteDuplicates(null);
//        printLinkedList(bResultHead);
//
//
//        ListNode root = new ListNode(8);
//        ListNode bEight = new ListNode(8);
//        ListNode cEight = new ListNode(8);
//        root.next = bEight;
//        bEight.next = cEight;
//
//        System.out.println();
//        System.out.println("***Before***");
//        printLinkedList(root);
//
//        System.out.println();
//        System.out.println("***After***");
//        ListNode resultHead = deleteDuplicates(root);
//        printLinkedList(resultHead);

        ListNode root = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        root.next = two;
        two.next = three;

        System.out.println();
        System.out.println("***Before***");
        printLinkedList(root);

        System.out.println();
        System.out.println("***After***");
        ListNode resultHead = deleteDuplicates(root);
        printLinkedList(resultHead);

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