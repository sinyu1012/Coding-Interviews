package ��Ŀ16�����е�����k���ڵ�;

import ��Ŀ3��β��ͷ��ӡ����.ListNode;

/**
 * ��Ŀ���� ����һ����������������е�����k����㡣
 * ˼·���£�����ָ�룬���õ�һ��ָ��͵ڶ���ָ�붼ָ��ͷ��㣬Ȼ�����õ�һ��ָ����(k-1)���������k���ڵ�
 * ��Ȼ������ָ��ͬʱ�����ƶ�������һ����㵽��ĩβ��ʱ�򣬵ڶ����������λ�þ��ǵ�����k���ڵ��ˡ�
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
