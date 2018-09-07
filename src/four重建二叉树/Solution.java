package four�ؽ�������;

/**
 * ��Ŀ����
����ĳ��������ǰ���������������Ľ�������ؽ����ö����������������ǰ���������������Ľ���ж������ظ������֡�
��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
˼·��ǰ���һ�����Ǹ���ͨ�����ҵ�����ĸ�������ֳ����ߣ�һ����������һ�������������õݹ����¡�
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
