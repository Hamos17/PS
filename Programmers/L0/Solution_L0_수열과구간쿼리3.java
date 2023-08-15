import java.util.Arrays;

public class Solution_L0_수열과구간쿼리3 {
	public static int[] solution(int[] arr, int[][] queries) {
		for(int i=0;i<queries.length;i++) {
			int[] query = queries[i];
			
			int temp = arr[query[0]];
			arr[query[0]] = arr[query[1]];
			arr[query[1]] = temp;
		}
		
        return arr;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 0, 1, 2, 3, 4 }, new int[][] { { 0, 3 }, { 1, 2 }, { 1, 4 } })));
	}
}