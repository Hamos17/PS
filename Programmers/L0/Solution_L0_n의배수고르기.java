import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_n의배수고르기 {
	public static int[] solution(int n, int[] numlist) {
		List<Integer> list = new ArrayList<>();
		for(int num : numlist) {
			if(num % n == 0) {
				list.add(num);
			}
		}

		int[] result = new int[list.size()];
		for(int i=0;i<result.length;i++) {
			result[i] = list.get(i);
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3, new int[] { 4, 5, 6, 7, 8, 9, 10, 11, 12 })));
		System.out.println(Arrays.toString(solution(5, new int[] { 1, 9, 3, 10, 13, 5 })));
		System.out.println(Arrays.toString(solution(12, new int[] { 2, 100, 120, 600, 12, 12 })));
	}
}
