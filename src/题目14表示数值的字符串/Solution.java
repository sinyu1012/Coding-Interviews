package ��Ŀ14��ʾ��ֵ���ַ���;

/**
 * ��Ŀ����
 * ��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С���������磬�ַ���"+100","5e2","-123","3.1416"��"-1E-16"
 * ����ʾ��ֵ�� ����"12e","1a3.14","1.2.3","+-5"��"12e+4.3"�����ǡ� ˼·ʹ��������ʽ
 * 
 * ���¶�������н���: [\\+\\-]? -> ���򸺷��ų������ \\d* -> ���������Ƿ���֣���-.34 �� +3.34������
 * (\\.\\d+)? -> �������С���㣬��ôС���������������֣� ����һ�𲻳��� ([eE][\\+\\-]?\\d+)? ->
 * �������ָ�����֣���ôe��E�϶����֣�+��-���Բ����֣� �����ű�����������������������ֶ�������
 * 
 * @author Sinyu
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.isNumeric("+1E-16".toCharArray()));

	}

	public boolean isNumeric(char[] str) {
		String string = new String(str);
		return string.matches("[\\+\\-]?\\d*(\\.\\d+)?([eE][\\+\\-]?\\d+)?");

	}

}
