package 题目13正则表达式匹配;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean match(char[] str, char[] pattern) {
		return matchTwo(str, 0, str.length, pattern, 0, pattern.length);

	}

	private boolean matchTwo(char[] str, int i, int length1, char[] pattern,
			int j, int length2) {
		if (i == length1 && j == length2) {
			return true;
		}
		if (i == length1 && j != length2) {
			while (j != length2) {
				if (pattern[j] != '*'
						&& (j + 1 >= length2 || pattern[j + 1] != '*')) {
					return false;
				}
				j++;
			}
			return true;
		}
		if (i != length1 && j == length2) {
			return false;
		}
		if (j + 1 == length2) {
			if (str[i] == pattern[j] || pattern[j] == '.')
				return matchTwo(str, i + 1, length1, pattern, j + 1, length2);
			else {
				return false;
			}
		}
		if ((str[i] == pattern[j] || pattern[j] == '.')
				&& pattern[j + 1] != '*')
			return matchTwo(str, i + 1, length1, pattern, j + 1, length2);
		if ((str[i] == pattern[j] || pattern[j] == '.')
				&& pattern[j + 1] == '*')
			return matchTwo(str, i, length1, pattern, j + 2, length2)
					|| matchTwo(str, i + 1, length1, pattern, j, length2);
		if (pattern[j + 1] == '*')
			return matchTwo(str, i, length1, pattern, j + 2, length2);
		return false;
	}
}
