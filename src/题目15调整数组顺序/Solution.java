package ��Ŀ15��������˳��;

/**
 * 
 * ��Ŀ���� ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�����֤������������
 * ż����ż��֮������λ�ò��䡣
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] arr = new int[] { 1, 2, 4, 3, 5 };
		s.reOrderArray1(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// ��ָoffer˼·������ָ�����˿�ʼ�ң�Ȼ�󽻻�
	public void reOrderArray(int[] array) {
		if (array.length <= 0) {
			return;
		}
		int pBegin = 0;
		int pEnd = array.length - 1;
		while (pBegin < pEnd) {
			// ����ƶ�ֱ��ż��
			while (pBegin < pEnd && (array[pBegin] & 0x1) != 0) {
				pBegin++;
			}
			// ��ǰ�ƶ�ֱ������
			while (pBegin < pEnd && (array[pEnd] & 0x1) == 0) {
				pEnd--;
			}
			if (pBegin < pEnd) {
				int temp = array[pBegin];
				array[pBegin] = array[pEnd];
				array[pEnd] = temp;
			}
		}
	}

	// ð��˼·,����ȫ����ǰż����
	public void reOrderArray1(int[] array) {
		for (int i = 0; i < array.length - 1; i++)
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] % 2 == 0 && array[j + 1] % 2 == 1) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
	}

}
