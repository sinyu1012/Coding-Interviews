package ��Ŀ24������������˫������;

import ��Ŀ4�ؽ�������.TreeNode;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 /**
     * ��Ŀ������һ�ö��������������ö���������ת����һ�������˫������
     * Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
     *
     * @param root �������ĸ����
     * @return ˫�������ͷ���
     */
    public static TreeNode convert(TreeNode root) {

        // ���ڱ��洦������е�˫�������β���
        TreeNode[] lastNode = new TreeNode[1];
        convertNode(root, lastNode);

        // �ҵ�˫�������ͷ���
        TreeNode head = lastNode[0];
        while (head != null && head.left != null) {
            head = head.left;
        }
        return head;
    }


    /**
     * �����ת������
     *
     * @param node     ��ǰ�ĸ����
     * @param lastNode �Ѿ�����õ�˫�������β��㣬ʹ��һ������Ϊ1�����飬����C++�еĶ���ָ��
     */
    public static void convertNode(TreeNode node, TreeNode[] lastNode) {
        // ��㲻Ϊ��
        if (node != null) {

            // ��������������ȴ���������
            if (node.left != null) {
                convertNode(node.left, lastNode);
            }

            // ����ǰ����ǰ��ָ���Ѿ�����õ�˫�������ɵ�ǰ�������������ɣ���β���
            node.left = lastNode[0];

            // ���������ת���ɵ�˫������Ϊ�գ�����β���ĺ��
            if (lastNode[0] != null) {
                lastNode[0].right = node;
            }

            // ��¼��ǰ���Ϊβ���
            lastNode[0] = node;

            // ����������
            if (node.right != null) {
                convertNode(node.right, lastNode);
            }
        }
    }
}
