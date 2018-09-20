package 题目10二进制中1的个数;

/**
 * 题目描述
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
思路：剑指offer P100
最优解：一个数减1之后，最右边的1变为0,1右边的0变为1，左边不受影响，
在将结果和原来的值做与运算，就会将改变成1的位重新改为0，那么经过N次这样的运算最后结果为0结束，就会有N个1.
如1100，经过-1后为1011，与原来值与运算，得到1000，再重复。
 * @author Sinyu
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NumberOf1(9));
	}

	public static int NumberOf1(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = (n - 1) & n;
		}
		return count;
	}
}
