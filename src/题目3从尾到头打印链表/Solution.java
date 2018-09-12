package 题目3从尾到头打印链表;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 题目描述
输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
思路：方法一，先进后出可用栈实现，方法二，使用递归
 * @author Sinyu
 *
 */
public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode listNode=new ListNode(0);
		ListNode listNode1=listNode;
		for (int i = 1; i < 10; i++) {
			ListNode node=new ListNode(i);
			listNode1.next=node;
			listNode1=node;
		}
		 ArrayList<Integer> list= printListFromTailToHead1(listNode);
		 for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	static ArrayList<Integer> lists=new  ArrayList<Integer>();
	/**
	 * 递归
	 * @param listNode
	 * @return
	 */
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	
        if(listNode!=null){
        	if(listNode.next!=null){
        		printListFromTailToHead(listNode.next);
        	}
        	lists.add(listNode.val);
//        	System.out.println(listNode.val);
            
        }
        return lists;
    }
    
    /**
     * 出栈 
     * @param listNode
     * @return
     */
    
    public static ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
    	Stack<Integer> stack=new Stack<Integer>();
    	
        while(listNode!=null){
        	stack.push(listNode.val);
        	listNode=listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()){
        	list.add(stack.pop());
        }
        return list;
    }
}