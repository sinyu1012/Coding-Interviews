package ��Ŀ8��̬��̨��;

/**
 * ��Ŀ���� һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж����������� ˼·��
 * ��Ϊn��̨�ף���һ����n����������1������2��������n�� ��1����ʣ��n-1������ʣ��������f(n-1) ��2����ʣ��n-2������ʣ��������f(n-2)
 * ����f(n)=f(n-1)+f(n-2)+...+f(1) ��Ϊf(n-1)=f(n-2)+f(n-3)+...+f(1) ����f(n)=2*f(n-1)
 * 
 * @author Sinyu
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(JumpFloorII(10));
	}

	public static int JumpFloorII(int target) {
		if (target <= 0) {
			return -1;
		} else if (target == 1) {
			return 1;
		} else {
			return 2 * JumpFloorII(target - 1);
		}
	}
}
