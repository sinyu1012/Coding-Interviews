package 题目16链表中倒数第k个节点;

import 题目3从尾到头打印链表.ListNode;

/**
 * 题目描述 输入一个链表，输出该链表中倒数第k个结点。
 * 思路如下：两个指针，先让第一个指针和第二个指针都指向头结点，然后再让第一个指正走(k-1)步，到达第k个节点
 * 。然后两个指针同时往后移动，当第一个结点到达末尾的时候，第二个结点所在位置就是倒数第k个节点了。
 * 
 * @author Sinyu
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode listNode = new ListNode(0);
		ListNode listNode1 = listNode;
		for (int i = 1; i < 10; i++) {
			ListNode node = new ListNode(i);
			listNode1.next = node;
			listNode1 = node;
		}
		Solution s = new Solution();
		System.out.println(s.FindKthToTail(listNode, -1).val);

	}

	public ListNode FindKthToTail(ListNode head, int k) {
		if (head == null || k <= 0) {
			return null;
		}
		ListNode pA = head;
		ListNode pB = null;
		for (int i = 0; i < k - 1; i++) {
			if (pA.next != null) {
				pA = pA.next;
			} else {
				return null;
			}
		}
		pB = head;
		while (pA.next != null) {
			pA = pA.next;
			pB = pB.next;

		}
		return pB;
	}
}
