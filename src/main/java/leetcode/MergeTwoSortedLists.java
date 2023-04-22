package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(list1, list2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // brute force method

        List<Integer> combinedList = new ArrayList<>();
        while (list1 != null) {
            combinedList.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            combinedList.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(combinedList);

        ListNode result = new ListNode();
        ListNode temp = result;
        for (int i = 0; i < combinedList.size(); i++) {
            result.next = new ListNode(combinedList.get(i));
            result = result.next;
        }

        temp = temp.next;
/*        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }*/

        return temp;
    }
}
/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.*/
