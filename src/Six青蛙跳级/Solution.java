package Six青蛙跳级;

/**
 * 题目描述：一只青蛙一次可以跳上 1 级台阶，也可以跳上2 级。求该青蛙跳上一个n 级的台阶总共有多少种跳法。
 * 思路：设f(n)表示青蛙跳上n级台阶的跳法数。当只有一个台阶时，
即n = 1时， 只有1中跳法；
当n = 2时，有两种跳法；
当n = 3 时，有3种跳法；
当n很大时，青蛙在最后一步跳到第n级台阶时，有两种情况：
一种是青蛙在第n-1个台阶跳一个台阶，那么青蛙完成前面n-1个台阶，就有f(n-1)种跳法，这是一个子问题。
另一种是青蛙在第n-2个台阶跳两个台阶到第n个台阶，那么青蛙完成前面n-2个台阶，就有f(n-2)种情况，这又是另外一个子问题。

两个子问题构成了最终问题的解，所以当n>=3时，青蛙就有f(n)=f(n-1)+f(n-2)种跳法。上面的分析过程，其实我们用到了动态规划的方法，找到了状态转移方程
 * @author Sinyu
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fibonacci(10));
	}
	private static long Fibonacci(int n){
		long one=1;
		long two=1;
		long newNum=0;
		for (int i = 2; i < n; i++) {
			newNum=one+two;
			one=two;
			two=newNum;
		}
		return newNum;
	}
}
