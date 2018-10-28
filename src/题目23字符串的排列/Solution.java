package ��Ŀ23�ַ���������;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * ��Ŀ����
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С����������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac
 * ,bca,cab��cba�� 
 * ˼·:�ݹ飬��Ϊ�����֣�һ���ֵ�һ���ַ���һ���ֺ�����ַ��������������֣�Ȼ�����Ĳ����ټ�����Ϊ�����֣��ٽ���
 * 
 * @author Sinyu
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list = new Solution().Permutation("abc");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public ArrayList<String> Permutation(String str) {
		ArrayList<String> result = new ArrayList<String>();
		if (str == null || str.length() == 0) {
			return result;
		}
		char[] chars = str.toCharArray();
		TreeSet<String> temp = new TreeSet<String>();
		Permutation(chars, 0, temp);
		result.addAll(temp);
		return result;
	}

	private void Permutation(char[] chars, int begin, TreeSet<String> result) {
		// TODO Auto-generated method stub
		if (chars.length == 0 || chars == null || begin < 0
				|| begin > chars.length - 1) {
			return;
		}
		if (begin == chars.length - 1) {
			System.out.println(String.valueOf(chars));
			result.add(String.valueOf(chars));
		} else {
			for (int i = begin; i < chars.length; i++) {
				swap(chars, begin, i);
				System.out.println(String.valueOf(chars) + "----");
				Permutation(chars, begin + 1, result);
				System.out.println("----!");
				swap(chars, begin, i);
				System.out.println(String.valueOf(chars) + "----!");
			}
		}

	}

	private void swap(char[] chars, int begin, int i) {
		// TODO Auto-generated method stub
		char temp = chars[i];
		chars[i] = chars[begin];
		chars[begin] = temp;
	}

}
