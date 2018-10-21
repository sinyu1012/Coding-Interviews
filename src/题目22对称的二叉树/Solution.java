package ��Ŀ22�ԳƵĶ�����;

import ��Ŀ4�ؽ�������.TreeNode;

/**
 * ��Ŀ���� ��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
 * ˼·��ǰ�������ǰ������ĶԳƱ����õ��Ľ��˳����һ���ģ��ҿ���null����������ǶԳƵ�
 * 
 * @author Sinyu
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	boolean isSymmetrical(TreeNode pRoot) {
		return isSymmetrical(pRoot, pRoot);
	}

	private boolean isSymmetrical(TreeNode pRoot1, TreeNode pRoot2) {
		// TODO Auto-generated method stub
		if (pRoot1 == null && pRoot2 == null) {
			return true;
		}
		if (pRoot1 == null || pRoot2 == null) {
			return false;
		}
		if (pRoot1.val != pRoot2.val) {
			return false;
		}
		return isSymmetrical(pRoot1.left, pRoot2.right)
				&& isSymmetrical(pRoot1.right, pRoot2.left);
	}
}
