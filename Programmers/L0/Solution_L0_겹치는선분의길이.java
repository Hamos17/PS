
public class Solution_L0_겹치는선분의길이 {
	public static int solution(int[][] lines) {
		int[] count = new int[200];

		for(int i=0;i<lines.length;i++) {
			int x = lines[i][0];
			int y = lines[i][1];

			for(int j=x + 100;j<y + 100;j++) {
				count[j]++;
			}
		}

		int result = 0;
		for(int i=0;i<200;i++) {
			if(1 < count[i]) {
				result++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[][] { { 1, 2 }, { 2, 5 }, { 3, 9 } }));
		System.out.println(solution(new int[][] { { -1, 1 }, { 1, 3 }, { 3, 9 } }));
		System.out.println(solution(new int[][] { { 0, 5 }, { 3, 9 }, { 1, 10 } }));
	}
}
