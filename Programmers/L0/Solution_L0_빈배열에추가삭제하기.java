import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_빈배열에추가삭제하기 {
	public static int[] solution(int[] arr, boolean[] flag) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			int val = arr[i];
			
			if(flag[i]) {
				for(int j=0;j<val * 2;j++) {
					list.add(val);
				}
			}else {
				while(val-- > 0) {
					list.remove(list.size() - 1);
				}
			}
		}
		
		int[] result = new int[list.size()];
		for(int i=0;i<result.length;i++) {
			result[i] = list.get(i);
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 3, 2, 4, 1, 3 }, new boolean[] { true, false, true, false, false })));
	}
}
