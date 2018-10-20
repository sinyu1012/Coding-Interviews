package 题目20树的子结构;

import 题目4重建二叉树.TreeNode;
/**
 * 题目描述
输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
思路：递归判断
 * @author Sinyu
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result=false;
        if (root1!=null&&root2!=null) {
        	 if (root1.val==root2.val) {
     			result=DoesTree1HaveTree2(root1,root2);
     		}
             if (!result) {
             	result=DoesTree1HaveTree2(root1.left,root2);
     		}
             if (!result) {
             	result=DoesTree1HaveTree2(root1.right,root2);
     		}
		}
       
        return result;
    }
	private boolean DoesTree1HaveTree2(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		if (root2==null) {
			return true;
		}
		if (root1==null) {
			return false;
		}
		if (root1.val!=root2.val) {
			return false;
		}
		
		return DoesTree1HaveTree2(root1.left, root2.left)&&DoesTree1HaveTree2(root1.right, root2.right);
	}
}
