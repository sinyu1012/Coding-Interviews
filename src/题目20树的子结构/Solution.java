package ��Ŀ20�����ӽṹ;

import ��Ŀ4�ؽ�������.TreeNode;
/**
 * ��Ŀ����
�������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
˼·���ݹ��ж�
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
