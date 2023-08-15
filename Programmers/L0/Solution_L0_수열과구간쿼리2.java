import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_수열과구간쿼리2 {
	public static int[] solution(int[] arr, int[][] queries) {
		int[] result = new int[queries.length];
		
		for(int i=0;i<queries.length;i++) {
			int[] query = queries[i];
			int s = query[0];
			int e = query[1];
			int k = query[2];
			
			int min = Integer.MAX_VALUE;
			int idx = -1;
			for(int j=s;j<=e;j++) {
				if(k < arr[j]) {
					idx = j;
					min = Math.min(min, arr[j]);
				}
			}
			
 			if(min == Integer.MAX_VALUE) {
				result[i] = -1;
			}else {
				result[i] = min;
			}
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 0, 1, 2, 4, 3 }, new int[][] { { 0, 4, 2 }, { 0, 3, 2 }, { 0, 2, 2 } })));
	}
}