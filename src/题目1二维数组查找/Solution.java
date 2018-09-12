package ��Ŀ1��ά�������;

/**
 * ��Ŀ����
��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������
ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 * @author Sinyu
 *
 */
public class Solution {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[][] { { 1, 2, 8, 9 }, { 2, 4, 9, 12 },
				{ 4, 7, 10, 13 }, { 6, 8, 11, 15 } };

		System.out.println(Find(9, a));
	}

	public static boolean Find(int target, int[][] array) {
		boolean found = false;
		int row = 0;
		int column = array.length - 1;
		while (row < array[0].length && column >= 0) {
			if (array[row][column] == target) {
				found = true;
				System.out.println(row + "-" + column);
				break;
			} else if (array[row][column] > target) {
				column--;
			} else {
				row++;

			}
		}
		return found;
	}

}
