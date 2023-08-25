import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_배열만들기3 {
	public static int[] solution(int[] arr, int[][] intervals) {
		List<Integer> list = new ArrayList<>();
		
		int[] interval1 = intervals[0];
		int[] interval2 = intervals[1];
		
		for(int i=interval1[0];i<=interval1[1];i++) {
			list.add(arr[i]);
		}
		
		for(int i=interval2[0];i<=interval2[1];i++) {
			list.add(arr[i]);
		}
		
		int[] result = new int[list.size()];
		for(int i=0;i<result.length;i++) {
			result[i] = list.get(i);
		}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 3, 4, 5 }, new int[][] { { 1, 3 }, { 0, 4} })));
	}
}
