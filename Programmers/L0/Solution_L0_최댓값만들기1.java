import java.util.Arrays;

public class Solution_L0_최댓값만들기1 {
	public static int solution(int[] numbers) {
		Arrays.sort(numbers);
		return numbers[numbers.length - 1] * numbers[numbers.length - 2];
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println(solution(new int[] { 0, 31, 24, 10, 1, 9 }));
	}
}
