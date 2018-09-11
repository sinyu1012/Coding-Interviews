package 题目7旋转数组的最小数字;

/**
 * 题目描述
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 
输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
思路：可直接遍历，这样的时间复杂度为O（n），没有利用题目给出的旋转数组的特性，明显不可取。
旋转数组可看出这是两个排序好的序列，可利用二分查找的思想进行查找。设置两个指针，分别指向前后位置，再找到中间元素对比，
如果大于前面指针指向的值说明在第一个排序里，这时将前面的指针指向中间位置，如果是小于后面值，那么表示在第二个序列里，将后面指针指向中间。
结束条件为，两个指针相邻时，表示已经找到分界线，后面一个指针指向的值就是该数组的最小值。
 * @author Sinyu
 *
 */
public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[]{3,4,5,1,2};
		System.out.println(minNumberInRotateArray(array));
		
	}

	public static int minNumberInRotateArray(int[] array) {
		int index1=0,index2=array.length-1,indexMid=index1;
		while(array[index1]>=array[index2]){
			if (index2-index1==1) {
				indexMid=index2;
				break;
				
			}
			indexMid=(index1+index2)/2;
			if (array[index1]<=array[indexMid]) {
				index1=indexMid;
			} else if (array[index2]>=array[indexMid]) {
				index2=indexMid;
			} 
		}
		return array[indexMid];
	}
}
