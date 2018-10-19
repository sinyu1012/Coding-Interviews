package 题目19合并两个排序的链表;

import 题目3从尾到头打印链表.ListNode;

/**
 * 题目描述 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * 思路，两个链表的头结点对比，小的那个存入新的链表，取出的那个链表指针后移，行成一个递归，
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
