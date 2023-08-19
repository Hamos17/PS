import java.util.Arrays;

public class Solution_L0_수열과구간쿼리4 {
	public static int[] solution(int[] arr, int[][] queries) {
		for(int i=0;i<queries.length;i++) {
			int[] query = queries[i];
			int s = query[0];
			int e = query[1];
			int k = query[2];
			
			for(int j=0;j<arr.length;j++) {
				if(s <= j && j <= e) {
					if(j % k == 0) {
						arr[j]++;
					}
				}
			}
		}

		return arr;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 0, 1, 2, 4, 3 }, new int[][] { { 0, 4, 1 }, { 0, 3, 2 }, { 0, 3, 3 } })));
	}
}
