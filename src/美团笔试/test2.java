package 美团笔试;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 你打开了美了么外卖，选择了一家店，你手里有一张满X元减10元的券，店里总共有n种菜，第i种菜一份需要Ai元，因为你不想吃太多份同一种菜，所以每种菜你最多只能点一份，现在问你最少需要选择多少元的商品才能使用这张券。

 * @author Sinyu
 *
 */
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int X = scanner.nextInt();
		int A[] = new int[n];
		List<Integer> arrangeSet = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arrangeSet.add(scanner.nextInt());
		}
		int sum = 0;

		List<Integer> arrangeList = arrangeSelect(arrangeSet);
		TreeSet tSet = new TreeSet<>(arrangeList);
		Iterator<Integer> iterator = tSet.iterator();
		while (iterator.hasNext()) {
			int result = (int) iterator.next();
			if (result > X) {
				sum = result;
				break;
			}
		}
		System.out.println(sum);
	}

	public static List<Integer> arrangeSelect(List<Integer> data) {
		List<Integer> resultSet = new ArrayList<>();
		for (int i = 0; i < data.size(); i++) {
			resultSet = combinerSelect(data, new ArrayList<Integer>(), data.size(), i + 1, resultSet);
		}
		return resultSet;
	}

	public static List<Integer> combinerSelect(List<Integer> data, List<Integer> workSpace, int n, int k,
			List<Integer> resultList) {
		List<Integer> copyData;
		List<Integer> copyWorkSpace;
		if (workSpace.size() == k) {
			List<Integer> everyResultList = new ArrayList<>();
			int sum = 0;
			for (Integer c : workSpace) {
				sum += (int) c;
				everyResultList.add(c);
			}
			resultList.add(sum);
			// resultList.add(everyResultList);
		}
		for (int i = 0; i < data.size(); i++) {
			copyData = new ArrayList<>(data);
			copyWorkSpace = new ArrayList<>(workSpace);
			copyWorkSpace.add(copyData.get(i));
			for (int j = i; j >= 0; j--) {
				copyData.remove(j);
			}
			combinerSelect(copyData, copyWorkSpace, n, k, resultList);
		}
		return resultList;
	}

}
