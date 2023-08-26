
public class Solution_L0_공던지기 {
	public static int solution(int[] numbers, int k) {
		int idx = (k - 1) * 2;
		idx %= numbers.length;
		
		return numbers[idx];
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3, 4 }, 2));
		System.out.println(solution(new int[] { 1, 2, 3, 4, 5, 6 }, 5));
		System.out.println(solution(new int[] { 1, 2, 3 }, 3));
		System.out.println(solution(new int[] { 1, 2, 3 }, 2));
	}
}
