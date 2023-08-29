import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_순서바꾸기 {
	public static int[] solution(int[] num_list, int n) {
		List<Integer> list = new ArrayList<>();
		
		for(int num : num_list) {
			list.add(num);
		}
		
		List<Integer> subList1 = list.subList(n, list.size());
		List<Integer> subList2 = list.subList(0, n);
		
		int[] result = new int[num_list.length];
		for(int i=0;i<subList1.size();i++) {
			result[i] = subList1.get(i);
		}

		for(int i=0;i<subList2.size();i++) {
			result[i + subList1.size()] = subList2.get(i);
		}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 2, 1, 6 }, 1)));
		System.out.println(Arrays.toString(solution(new int[] { 5, 2, 1, 7, 5 }, 3)));
	}
}
