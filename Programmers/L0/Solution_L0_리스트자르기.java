import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_리스트자르기 {
	public static int[] solution(int n, int[] slicer, int[] num_list) {
		List<Integer> list = new ArrayList<>();
		
		switch (n) {
		case 1:
			for(int i=0;i<=slicer[1];i++) {
				list.add(num_list[i]);
			}
			
			break;
		case 2:
			for(int i=slicer[0];i<num_list.length;i++) {
				list.add(num_list[i]);
			}
			
			break;
		case 3:
			for(int i=slicer[0];i<=slicer[1];i++) {
				list.add(num_list[i]);
			}
			
			break;
		default:
			for(int i=slicer[0];i<=slicer[1];i+=slicer[2]) {
				list.add(num_list[i]);
			}
			
			break;
		}
		
		int[] result = new int[list.size()];
		for(int i=0;i<result.length;i++) {
			result[i] = list.get(i);
		}

		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3, new int[] { 1, 5, 2 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 })));
		System.out.println(Arrays.toString(solution(4, new int[] { 1, 5, 2 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 })));
	}
}
