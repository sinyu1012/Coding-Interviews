package ��Ŀ5����ջʵ�ֶ���;

import java.util.Stack;

/**
 * ��Ŀ����
������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�

˼·��ջ1����push��popʱ ջ2Ϊ��ʱ��ջ1ȫ������������ջ2pop����Ϊ����pop ջ2

 * @author Sinyu
 *
 */
public class Solution {

	 Stack<Integer> stack1 = new Stack<Integer>();
	 Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);
	}

	public int pop() {
		if (stack2.size()!=0) {
			return stack2.pop();
		}else{
			for (int i = 0; stack1.size()>0; i++) {
				int pop=stack1.pop();
				stack2.push(pop);
				
			}
			return stack2.pop();
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		for (int i = 0; i < 10; i++) {
			s.push(i);
		}
		System.out.println(s.pop());
		
	}
}
