package 题目5两个栈实现队列;

import java.util.Stack;

/**
 * 题目描述
用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。

思路：栈1用来push，pop时 栈2为空时，栈1全部传来，并且栈2pop，不为空则pop 栈2

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
