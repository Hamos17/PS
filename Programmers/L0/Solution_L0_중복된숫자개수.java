
public class Solution_L0_중복된숫자개수 {
	public static int solution(int[] array, int n) {
		int count = 0;
		for(int num : array) {
			if(num == n) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 1, 2, 3, 4, 5 }, 1));
		System.out.println(solution(new int[] { 0, 2, 3, 4 }, 1));
	}
}
