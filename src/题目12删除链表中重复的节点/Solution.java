package ��Ŀ12ɾ���������ظ��Ľڵ�;

import ��Ŀ3��β��ͷ��ӡ����.ListNode;

/**
 * ��Ŀ����
��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣 ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5

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
				//��ɾ��
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
