package �滻�ո�;

/**
 * ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 * ˼·����ǰ������룬��Ҫ�����ƶ��Ĵ�����ʱ�临�Ӷ�ΪO��nƽ������
 * ��Ч�ʣ��Ӻ���ǰ���룬�ȼ�����ܿռ䣬�ٴӺ���ǰ������ÿ���ַ�ֻ�ƶ�һ�Σ������ո��ٲ��룬ʱ�临�Ӷ�O��n��
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
	    int indexofOld=len-1,indexofNew=newLength-1;//ָ��ֱ�ָ��ԭ����ĩβ���滻֮��ĩβ
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
