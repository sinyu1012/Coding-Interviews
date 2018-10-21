package ��Ŀ21�������ľ���;

import ��Ŀ4�ؽ�������.TreeNode;
/**
 * ��Ŀ����
���������Ķ�����������任ΪԴ�������ľ���
��������:
�������ľ����壺Դ������ 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	���������
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 * ˼·��ǰ�����������ͬʱ�������ҽڵ㣬����Ϊ��ʱ������
 * @author Sinyu
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void Mirror(TreeNode root) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			return;
		}
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;

		if (root.left != null) {
			Mirror(root.left);
		}
		if (root.right != null) {
			Mirror(root.right);
		}
	}
}
