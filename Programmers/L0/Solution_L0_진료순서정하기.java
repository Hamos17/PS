import java.util.Arrays;

public class Solution_L0_진료순서정하기 {
	public static int[] solution(int[] emergency) {
		int[] result = new int[emergency.length];

		for(int i=0;i<result.length;i++) {
			int rank = 1;
			for(int j=0;j<emergency.length;j++) {
				if(i == j) {
					continue;
				}

				if(emergency[i] < emergency[j]) {
					rank++;
				}
			}

			result[i] = rank;
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 3, 76, 24 })));
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 3, 4, 5, 6, 7 })));
		System.out.println(Arrays.toString(solution(new int[] { 30, 10, 23, 6, 100 })));
	}
}
