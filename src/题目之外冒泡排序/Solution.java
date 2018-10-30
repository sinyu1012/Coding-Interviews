package 题目之外冒泡排序;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[]{3,2,1,4,7,6,5};
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
