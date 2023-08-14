import java.util.Arrays;

public class Solution_L0_배열두배만들기 {
	public static int[] solution(int[] numbers) {
		for(int i=0;i<numbers.length;i++) {
			numbers[i] *= 2;
		}
		
		return numbers;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 3, 4, 5 })));
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 100, -99, 1, 2, 3 })));
	}
}