package ��Ŀ19�ϲ��������������;

import ��Ŀ3��β��ͷ��ӡ����.ListNode;

/**
 * ��Ŀ���� ���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
 * ˼·�����������ͷ���Աȣ�С���Ǹ������µ�����ȡ�����Ǹ�����ָ����ƣ��г�һ���ݹ飬
 * 
 * @author Sinyu
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode Merge(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}
		ListNode pMergeHead = null;
		if (list1.val < list2.val) {
			pMergeHead = list1;
			pMergeHead.next = Merge(list1.next, list2);
		} else {
			pMergeHead = list2;
			pMergeHead.next = Merge(list1, list2.next);
		}
		return pMergeHead;
	}
}
