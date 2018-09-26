package 题目11数值的整数次方;

/**
 * 题目描述
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
思路：那道题很容就写出代码，可是没有经过思考，边界值等一些特殊情况的深入思考，例如负数次方是倒数，0的情况等。

算法优化，可以总结出8次方只需要计算4次方然后两个4次方相乘，以此类推。
并使用了右移代替除以2，位运算代替求余运算判断奇数偶数。
 * @author Sinyu
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution=new Solution();
		System.out.println(solution.Power(3, 5));
		
	}
	 public double Power(double base, int exponent) {
	     double result=0;
	     double epsilon = 0.001;
	     //考虑负数等条件
	     if (base==0&&exponent<0) {
			return 0.0;
		}
	     int absExponent=Math.abs(exponent);
	     result=PowerWithUnsignedExponent1(base,absExponent);
	     if (exponent<0) {
			result=1/result;
		}
	     return result;
		 
	  }
	private double PowerWithUnsignedExponent(double base, int exponent) {
		// TODO Auto-generated method stub
		double result=1;
		for (int i = 0; i < exponent; i++) {
			result*=base;
		}
		return result;
		
	}
	private double PowerWithUnsignedExponent1(double base, int exponent) {
		// TODO Auto-generated method stub
		if (exponent==0) {
			return 1;
		}
		if (exponent==1) {
			return base;
		}
		double result=PowerWithUnsignedExponent1(base,exponent>>1);
		result*=result;
		if ((int)(exponent&0x1)==1) {
			result*=base;
		}
		return result;
		
	}
}
