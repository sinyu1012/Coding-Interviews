package ��Ŀ11��ֵ�������η�;

/**
 * ��Ŀ����
����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
˼·���ǵ�����ݾ�д�����룬����û�о���˼�����߽�ֵ��һЩ�������������˼�������縺���η��ǵ�����0������ȡ�

�㷨�Ż��������ܽ��8�η�ֻ��Ҫ����4�η�Ȼ������4�η���ˣ��Դ����ơ�
��ʹ�������ƴ������2��λ����������������ж�����ż����
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
	     //���Ǹ���������
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
