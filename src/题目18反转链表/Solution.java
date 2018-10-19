package 题目18反转链表;

import 题目3从尾到头打印链表.ListNode;
/**
 * 题目描述
输入一个链表，反转链表后，输出新链表的表头。
 * @author Sinyu
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode ReverseList(ListNode head) {
		ListNode pReversedHead = null;
		ListNode pNode = head;
		ListNode pPrev = null;
		while (pNode != null) {
			ListNode pNext = pNode.next;
			if (pNext == null) {
				pReversedHead = pNode;
			}
			pNode.next = pPrev;

			pPrev = pNode;
			pNode = pNext;
		}
		return pReversedHead;
	}
}
