package ��Ŀ7��ת�������С����;

/**
 * ��Ŀ����
��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� 
����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء� 
��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
˼·����ֱ�ӱ�����������ʱ�临�Ӷ�ΪO��n����û��������Ŀ��������ת��������ԣ����Բ���ȡ��
��ת����ɿ���������������õ����У������ö��ֲ��ҵ�˼����в��ҡ���������ָ�룬�ֱ�ָ��ǰ��λ�ã����ҵ��м�Ԫ�ضԱȣ�
�������ǰ��ָ��ָ���ֵ˵���ڵ�һ���������ʱ��ǰ���ָ��ָ���м�λ�ã������С�ں���ֵ����ô��ʾ�ڵڶ��������������ָ��ָ���м䡣
��������Ϊ������ָ������ʱ����ʾ�Ѿ��ҵ��ֽ��ߣ�����һ��ָ��ָ���ֵ���Ǹ��������Сֵ��
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
