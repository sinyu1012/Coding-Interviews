package 二维数组查找;

/**
 * 题目描述
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
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
