package ��Ŀ10��������1�ĸ���;

/**
 * ��Ŀ����
����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
˼·����ָoffer P100
���Ž⣺һ������1֮�����ұߵ�1��Ϊ0,1�ұߵ�0��Ϊ1����߲���Ӱ�죬
�ڽ������ԭ����ֵ�������㣬�ͻὫ�ı��1��λ���¸�Ϊ0����ô����N�����������������Ϊ0�������ͻ���N��1.
��1100������-1��Ϊ1011����ԭ��ֵ�����㣬�õ�1000�����ظ���
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
