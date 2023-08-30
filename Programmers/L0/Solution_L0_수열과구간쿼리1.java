import java.util.Arrays;

public class Solution_L0_수열과구간쿼리1 {
	public static int[] solution(int[] arr, int[][] queries) {
		for(int[] query : queries) {
			int s = query[0], e = query[1];
			
			for(int j=s;j<=e;j++) {
				arr[j]++;
			}
		}
		
        return arr;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 0, 1, 2, 3, 4 }, new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 } })));
	}
}
