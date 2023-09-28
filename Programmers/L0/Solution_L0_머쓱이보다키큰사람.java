
public class Solution_L0_머쓱이보다키큰사람 {
	public static int solution(int[] array, int height) {
		int count = 0;
		for(int num : array) {
			if(height < num) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 149, 180, 192, 170 }, 167));
		System.out.println(solution(new int[] { 180, 120, 140 }, 190));
	}
}
