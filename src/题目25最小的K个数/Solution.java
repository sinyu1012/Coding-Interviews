package ��Ŀ25��С��K����;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;
/**
 * ��Ŀ����
����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 * @author Sinyu
 *
 */

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
	       ArrayList<Integer> result = new ArrayList<Integer>();
	       int length = input.length;
	       if(k > length || k == 0){
	           return result;
	       }
	        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
	 
	            @Override
	            public int compare(Integer o1, Integer o2) {
	                return o2.compareTo(o1);
	            }
	        });
	        for (int i = 0; i < length; i++) {
	            if (maxHeap.size() != k) {
	                maxHeap.offer(input[i]);
	            } else if (maxHeap.peek() > input[i]) {
	                Integer temp = maxHeap.poll();
	                temp = null;
	                maxHeap.offer(input[i]);
	            }
	        }
	        for (Integer integer : maxHeap) {
	            result.add(integer);
	        }
	        return result;
	    }
}
