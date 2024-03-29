
public class Solution_L1_행렬의덧셈 {
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j] += arr2[i][j];
			}
		}

		return arr1;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[][] { { 1, 2 }, { 2, 3 } }, new int[][] { { 3, 4 }, { 5, 6 } }));
		System.out.println(solution(new int[][] { { 1 }, { 2 } }, new int[][] { { 3 }, { 4 } }));
	}
}
