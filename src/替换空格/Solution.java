package 替换空格;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * 思路：从前往后插入，需要计算移动的次数多时间复杂度为O（n平方），
 * 高效率：从后往前插入，先计算好总空间，再从后往前遍历，每个字符只移动一次，遇到空格再插入，时间复杂度O（n）
 * @author Sinyu
 *
 */
public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[][] { { 1, 2, 8, 9 }, { 2, 4, 9, 12 },
				{ 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		StringBuffer buffer=new StringBuffer("We Are Happy.");
		System.out.println(replaceSpace(buffer));
	}
	 public static String replaceSpace(StringBuffer str) {
	    int len=str.length(),newLength=0;
	    int spaceNum=0;
	    for (int i = 0; i < len; i++) {
	    	if(str.indexOf(" ", i)!=-1){
	    		spaceNum++;
	    		i=str.indexOf(" ", i);
	    	}
		}
	    newLength=len+spaceNum*2;
	    int indexofOld=len-1,indexofNew=newLength-1;//指针分别指向原来的末尾与替换之后末尾
	    str.setLength(newLength);
	    for (; indexofOld>=0&&indexofNew>indexofOld; --indexofOld) {
	    	if(str.charAt(indexofOld)==' '){
	    		str.setCharAt(indexofNew--, '0');
	    		str.setCharAt(indexofNew--, '2');
	    		str.setCharAt(indexofNew--, '%');
	    	}else{
	    		str.setCharAt(indexofNew--, str.charAt(indexofOld));
	    	}
			
		}
		return str.toString();
	 }
}
