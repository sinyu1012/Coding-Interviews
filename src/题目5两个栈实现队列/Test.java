package 题目5两个栈实现队列;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		for (int i = 0; i < 10; i++) {
			s.push(i);
		}
		System.out.println(s.pop());
		System.out.println(s.pop());
		
	}
}
