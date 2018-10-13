package 题目14表示数值的字符串;

/**
 * 题目描述
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"
 * 都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。 思路使用正则表达式
 * 
 * 以下对正则进行解释: [\\+\\-]? -> 正或负符号出现与否 \\d* -> 整数部分是否出现，如-.34 或 +3.34均符合
 * (\\.\\d+)? -> 如果出现小数点，那么小数点后面必须有数字； 否则一起不出现 ([eE][\\+\\-]?\\d+)? ->
 * 如果存在指数部分，那么e或E肯定出现，+或-可以不出现， 紧接着必须跟着整数；或者整个部分都不出现
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
