package 题目23字符串的排列;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * 题目描述
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac
 * ,bca,cab和cba。 
 * 思路:递归，看为两部分，一部分第一个字符，一部分后面的字符，交换两个部分，然后后面的部分再继续看为两部分，再交换
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
