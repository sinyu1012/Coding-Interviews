package ��Ŀ17�����л�����ڽڵ�;

import ��Ŀ3��β��ͷ��ӡ����.ListNode;

/**
 * ��Ŀ���� ��һ�����������а����������ҳ�������Ļ�����ڽ�㣬�������null�� ��������л�
 * ��n����㣬ָ��P1����������ǰ�ƶ�n����Ȼ������ָ������ͬ���ٶ���ǰ�ƶ���
 * ���ڶ���ָ��ָ�򻷵���ڽ��ʱ����һ��ָ���Ѿ�Χ���Ż�����һȦ�ֻص�����ڽ�㡣 ��������Ҫ�õ����н�����Ŀ��
 * 
 * @author Sinyu
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// �ҵ�һ��һ��ָ���������Ľڵ㣬�����Ľڵ�һ�����ڻ���
	public static ListNode meetingNode(ListNode head) {
		if (head == null)
			return null;

		ListNode slow = head.next;
		if (slow == null)
			return null;

		ListNode fast = slow.next;
		while (slow != null && fast != null) {
			if (slow == fast) {
				return fast;
			}
			slow = slow.next;
			fast = fast.next;

			if (fast != slow) {
				fast = fast.next;
			}
		}
		return null;
	}

	public ListNode EntryNodeOfLoop(ListNode pHead) {
		ListNode meetingNode = meetingNode(pHead);
		if (meetingNode == null)
			return null;
		// �õ����еĽڵ����
		int nodesInLoop = 1;
		ListNode p1 = meetingNode;
		while (p1.next != meetingNode) {
			p1 = p1.next;
			++nodesInLoop;
		}
		// �ƶ�p1
		p1 = pHead;
		for (int i = 0; i < nodesInLoop; i++) {
			p1 = p1.next;
		}
		// �ƶ�p1��p2
		ListNode p2 = pHead;
		while (p1 != p2) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}

}
