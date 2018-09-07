package four重建二叉树;

/**
 * 题目描述
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
思路：前序第一个就是根，通过根找到中序的根，中序分成两边，一边左子树，一边右子树，再用递归往下。
 * @author Sinyu
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pre={1,2,4,7,3,5,6,8};
		int[] in={4,7,2,1,5,3,8,6};
		PrintBinaryTreePreRecur(reConstructBinaryTree(pre,in));
	}
	 public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		 TreeNode tree=ConstructCore(pre,0,pre.length-1,in,0,in.length-1);
		 
	     return tree;
	 }
	 public static TreeNode ConstructCore(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {
		 if (startPre>endPre||startIn>endIn) {
			return null;
		}
		 int rootpre=pre[startPre];
		 TreeNode tree=new TreeNode(rootpre);
		 tree.left=tree.right=null;
		 
		 for (int i = startIn; i <= endIn; i++) {
			if (rootpre==in[i]) {
				tree.left=ConstructCore(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
				tree.right=ConstructCore(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
				break;
			}
		 }
	     return tree;
	 }
	 public static void PrintBinaryTreePreRecur(TreeNode root){
		 if (root!=null) {
			System.out.println(root.val);
			PrintBinaryTreePreRecur(root.left);
			PrintBinaryTreePreRecur(root.right);
		}
	 }
}
