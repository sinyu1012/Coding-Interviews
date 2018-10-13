package 题目15调整数组顺序;

/**
 * 
 * 题目描述 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，
 * 偶数和偶数之间的相对位置不变。
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

	// 剑指offer思路，两个指针两端开始找，然后交换
	public void reOrderArray(int[] array) {
		if (array.length <= 0) {
			return;
		}
		int pBegin = 0;
		int pEnd = array.length - 1;
		while (pBegin < pEnd) {
			// 向后移动直到偶数
			while (pBegin < pEnd && (array[pBegin] & 0x1) != 0) {
				pBegin++;
			}
			// 向前移动直到奇数
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

	// 冒泡思路,遍历全部，前偶后奇
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
