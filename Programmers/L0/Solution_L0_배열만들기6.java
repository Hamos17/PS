import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_배열만들기6 {
	public static int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			if(list.isEmpty()) {
				list.add(arr[i]);
				continue;
			}else {
				int lastVal = list.get(list.size() - 1);
				
				if(lastVal == arr[i]) {
					list.remove(list.size() - 1);
				}else {
					list.add(arr[i]);
				}
			}
		}

		if(list.size() == 0) {
			return new int[] { -1 };
		}
		
		int[] result = new int[list.size()];
		for(int i=0;i<result.length;i++) {
			result[i] = list.get(i);
		}

		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 0, 1, 1, 1, 0 })));
		System.out.println(Arrays.toString(solution(new int[] { 0, 1, 0, 1, 0 })));
		System.out.println(Arrays.toString(solution(new int[] { 0, 1, 1, 0 })));
	}
}
