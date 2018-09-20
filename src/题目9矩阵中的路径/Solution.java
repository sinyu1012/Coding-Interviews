package ��Ŀ9�����е�·��;

/**
 * ��Ŀ���� �����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����·�����ԴӾ����е�����һ�����ӿ�ʼ��
 * ÿһ�������ھ������������ң����ϣ������ƶ�һ�����ӡ����һ��·�������˾����е�ĳһ�����ӣ� ��֮�����ٴν���������ӡ� ���� a b c e s f
 * c s a d e e ������3 X 4 �����а���һ���ַ���"bcced"��·����
 * ���Ǿ����в�����"abcb"·������Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�һ�еڶ�������֮��·�������ٴν���ø��ӡ�
 * 
 * ˼·�����ݷ�
 * 1.��matrix�ַ���ģ��ӳ��Ϊһ���ַ�����(������ʵ�ʴ���һ������)
	2.ȡһ��boolean[matrix.length]���ĳ���ַ��Ƿ��Ѿ������ʹ���
	3.���û�ҵ��������Ҫ����Ӧ��boolean���ֵ�û�false,������һ�����������·�Ĳ��ҡ�
 * @author Sinyu
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		System.out.println(s.hasPath("ABCESFCSADEE".toCharArray(),3,4,"ABCCED".toCharArray()));
		
	}

	public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
		
		boolean[] isOk=new boolean[rows*cols];
		int pathLength=0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (hasPathCore(matrix,rows,cols,str,i,j,pathLength,isOk)) {
					return true;
				}
			}
		}
		
		return false;
	}

	private boolean hasPathCore(char[] matrix, int rows, int cols, char[] str,
			int row, int col, int pathLength, boolean[] isOk) {
		if(pathLength==str.length) { return true ; }
		boolean flag=false;
		
		if (row>=0&&row<rows&&col>=0&&col<cols&&matrix[row*cols+col]==str[pathLength]&&!isOk[row*cols+col]) {
			++pathLength;
			isOk[row*cols+col]=true;
//			System.out.println(pathLength);
			flag=hasPathCore(matrix,rows,cols,str,row,col-1,pathLength,isOk)||hasPathCore(matrix,rows,cols,str,row-1,col,pathLength,isOk)||hasPathCore(matrix,rows,cols,str,row,col+1,pathLength,isOk)||hasPathCore(matrix,rows,cols,str,row+1,col,pathLength,isOk);
			if (!flag) {
				pathLength--;
				isOk[row*cols+col]=false;
				
			}
		}
		
		
		return flag;
	}
}
