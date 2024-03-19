import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				list.add(arr[i]);
			} else {
				if (arr[i - 1] != arr[i]) {
					list.add(arr[i]);
				}

			}
		}

		int[] an = new int[list.size()];

		for (int j = 0; j < list.size(); j++) {
			an[j] = list.get(j);
		}

		return an;    }
}