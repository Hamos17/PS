
public class Solution_L0_특별한이차원배열1 {
	public static int[][] solution(int n) {
		int[][] result = new int[n][n];
		for(int i=0;i<n;i++) {
			result[i][i] = 1;
		}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(6));
		System.out.println(solution(1));
	}
}
