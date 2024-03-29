
public class Solution_L0_최댓값만들기2 {
	public static int solution(int[] numbers) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				max = Math.max(max, numbers[i] * numbers[j]);
			}
		}

		return max;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, -3, 4, -5 }));
		System.out.println(solution(new int[] { 0, -31, 24, 10, 1, 9 }));
		System.out.println(solution(new int[] { 10, 20, 30, 5, 5, 20, 5 }));
	}
}
