package 题目22对称的二叉树;

import 题目4重建二叉树.TreeNode;

/**
 * 题目描述 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 * 思路：前序遍历与前序遍历的对称遍历得到的结果顺序是一样的，且考虑null的情况，就是对称的
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
