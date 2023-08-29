import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_n개간격의원소들 {
	public static int[] solution(int[] num_list, int n) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<num_list.length;i+=n) {
			list.add(num_list[i]);
		}
		
		int[] result = new int[list.size()];
		for(int i=0;i<result.length;i++) {
			result[i] = list.get(i);
		}

		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 4, 2, 6, 1, 7, 6 }, 2)));
		System.out.println(Arrays.toString(solution(new int[] { 4, 2, 6, 1, 7, 6 }, 4)));
	}
}
