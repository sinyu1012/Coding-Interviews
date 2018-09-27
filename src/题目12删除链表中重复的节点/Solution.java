package 题目12删除链表中重复的节点;

import 题目3从尾到头打印链表.ListNode;

/**
 * 题目描述
在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5

 * @author Sinyu
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		ListNode listNode=new ListNode(0);
		ListNode listNode1=listNode;
		ListNode node1=new ListNode(1);
		listNode1.next=node1;
		listNode1=node1;
		for (int i = 1; i < 10; i++) {
			ListNode node=new ListNode(i);
			listNode1.next=node;
			listNode1=node;
		}
		
		listNode1=s.deleteDuplication(listNode);
		while(listNode1!=null){
			System.out.println(listNode1.val);
			listNode1=listNode1.next;
		}
		
		
	}
	 public ListNode deleteDuplication(ListNode pHead)
	    {
		 ListNode pPreNode=null,pNode=pHead;
		 while(pNode!=null){
			 ListNode pNext=pNode.next;
			 boolean needDelete=false;
			 if (pNext!=null&&pNext.val==pNode.val) {
				needDelete=true;
			}
			 if (!needDelete) {
				//不删除
				 pPreNode=pNode;
				pNode=pNode.next;
				
			} else {
				int value=pNode.val;
				ListNode pToBeDel=pNode;
				while (pToBeDel!=null&&pToBeDel.val==value) {
					pNext=pToBeDel.next;
					pToBeDel=null;
					pToBeDel=pNext;
				}
				if (pPreNode==null) {
					pHead=pNext;
				} else {
					pPreNode.next=pNext;
				}
				pNode=pNext;
			}
		 }
		 
		 return pHead;
		 
	    }
}
