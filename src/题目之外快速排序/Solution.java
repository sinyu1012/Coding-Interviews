package ��Ŀ֮���������;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[]{3,2,1,4,7,6,5};
		int low=0;
		int high=arr.length-1;
		QSort(arr,low,high);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void QSort(int arr[],int low,int high){
		if (low<high) {
			int loc=Partition(arr, low, high);//һ�˿���
			QSort(arr,low,loc-1);//������
			QSort(arr, loc+1, high);//������ݹ�
		}
	}
	public static int Partition(int arr[],int low,int high){
		int key=arr[low];
		while(low<high){
			while(low<high&&arr[high]>=key){
				high--;
			}
			int temp = arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			while(low<high&&arr[low]<=key){
				low++;
			}
			temp = arr[high];
			arr[high]=arr[low];
			arr[low]=temp;
		}
		return low;
	}
}
