package leetcode;

import java.util.ArrayList;

public class MiddleOfLinkedList {
    public static void main(String[] args) {


    }

    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> array = new ArrayList<>();
        int counter = 0;

        while(head != null) {
            array.add(head);
            head = head.next;
            counter++;
        }
        return array.get(counter / 2);
    }
}
