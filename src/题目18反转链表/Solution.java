package ��Ŀ18��ת����;

import ��Ŀ3��β��ͷ��ӡ����.ListNode;
/**
 * ��Ŀ����
����һ��������ת��������������ı�ͷ��
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
