import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_배열조각하기 {
	public static int[] solution(int[] arr, int[] query) {
		List<Integer> list = new ArrayList<>();
		for(int num : arr) {
			list.add(num);
		}
		
		for(int i=0;i<query.length;i++) {
			int idx = query[i];
			
			if(i % 2 == 0) {
				list = list.subList(0, idx + 1);
			}else {
				list = list.subList(idx, list.size());
			}
		}
		
		int[] result = new int[list.size()];
		for(int i=0;i<result.length;i++) {
			result[i] = list.get(i);
		}

		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 0, 1, 2, 3, 4, 5 }, new int[] { 4, 1, 2 })));
	}
}
