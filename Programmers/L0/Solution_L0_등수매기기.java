import java.util.Arrays;

public class Solution_L0_등수매기기 {
	public static int[] solution(int[][] score) {
		double[] avgs = new double[score.length];
		
		for(int i=0;i<score.length;i++) {
			int[] values = score[i];

			int mat = values[0];
			int eng = values[1];
			
			avgs[i] = (1.0 * (mat + eng)) / 2; 
		}

		int[] ranks = new int[avgs.length];
		
		for(int i=0;i<avgs.length;i++) {
			int rank = 1;
			for(int j=0;j<avgs.length;j++) {
				if(i == j) {
					continue;
				}
				
				if(avgs[i] < avgs[j]) {
					rank++;
				}
			}
			
			ranks[i] = rank;
		}
		
		return ranks;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[][] { { 80, 70 }
																  , { 90, 50 }
																  , { 40, 70 }
																  , { 50, 80 }})));

		System.out.println(Arrays.toString(solution(new int[][] { { 80, 70 }
																  , { 70, 80 }
																  , { 30, 50 }
																  , { 90, 100 }
																  , { 100, 90 }
																  , { 100, 100 }
																  , { 10, 30 }})));
	}
}
