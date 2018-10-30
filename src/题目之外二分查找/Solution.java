package 题目之外二分查找;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[]{1,2,3,4,5,6,7};
		
		System.out.println(binarySerach(arr, 7));
	}
	public static int binarySerach(int[] arr,int key){
		int low=0;
		int high=arr.length-1;
		while(low<=high){
			int mid=(low+high)/2;
			if (arr[mid]==key) {
				return mid;
			} else if (arr[mid]>key){
				high=mid-1;
			}
			else if (arr[mid]<key){
				low=mid+1;
			}
		}
		return -1;
	}

}
