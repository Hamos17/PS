
public class Solution_L0_평행 {
	public static int solution(int[][] dots) {
		int[] dot1 = dots[0];
		int[] dot2 = dots[1];
		int[] dot3 = dots[2];
		int[] dot4 = dots[3];

		int x1 = Math.abs(dot1[0] - dot2[0]);
		int y1 = Math.abs(dot1[1] - dot2[1]);

		double line1 = (1.0 * y1 / x1); 

		int x2 = Math.abs(dot3[0] - dot4[0]);
		int y2 = Math.abs(dot3[1] - dot4[1]);

		double line2 = (1.0 * y2 / x2); 

		if(line1 == line2) {
			return 1;
		}

		int x3 = Math.abs(dot1[0] - dot3[0]);
		int y3 = Math.abs(dot1[1] - dot3[1]);

		double line3 = (1.0 * y3 / x3); 

		int x4 = Math.abs(dot2[0] - dot4[0]);
		int y4 = Math.abs(dot2[1] - dot4[1]);

		double line4 = (1.0 * y4 / x4); 

		if(line3 == line4) {
			return 1;
		}

		int x5 = Math.abs(dot1[0] - dot4[0]);
		int y5 = Math.abs(dot1[1] - dot4[1]);

		double line5 = (1.0 * y5 / x5); 

		int x6 = Math.abs(dot2[0] - dot3[0]);
		int y6 = Math.abs(dot2[1] - dot3[1]);

		double line6 = (1.0 * y6 / x6); 

		if(line5 == line6) {
			return 1;
		}

		return 0;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[][] { { 1, 4 }, { 9, 2 }, { 3, 8 }, { 11, 6 } }));
		System.out.println(solution(new int[][] { { 3, 5 }, { 4, 1 }, { 2, 4 }, { 5, 10 } }));
	}
}
