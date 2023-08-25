import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L1_제일작은수제거하기 {
	public static int[] solution(int[] arr) {
		if(arr.length == 1) {
			return new int[] { -1 };
		}
		
		int idx = -1, min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
				idx = i;
			}
		}
		
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(i == idx) {
				continue;
			}
			
			list.add(arr[i]);
		}
		
		int[] result = new int[list.size()];
		for(int i=0;i<result.length;i++) {
			result[i] = list.get(i);
		}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 4, 3, 2, 1 })));
		System.out.println(Arrays.toString(solution(new int[] { 10 })));
	}
}
