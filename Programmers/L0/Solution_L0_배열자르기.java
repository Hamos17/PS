import java.util.Arrays;

public class Solution_L0_배열자르기 {
	public static int[] solution(int[] numbers, int num1, int num2) {
		int[] result = new int[num2 - num1 + 1];

		int idx = num1;
		for(int i=0;i<result.length;i++) {
			result[i] = numbers[idx++]; 
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 3, 4, 5 }, 1, 3)));
		System.out.println(Arrays.toString(solution(new int[] { 1, 3, 5 }, 1, 2)));
	}
}
