import java.util.Arrays;

public class Solution_L0_마지막두원소 {
	public static int[] solution(int[] num_list) {
		int[] result = new int[num_list.length + 1];

		int idx = 0;
		for(int num : num_list) {
			result[idx++] = num;
		}
		
		if(num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
			result[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];  
		}else {
			result[num_list.length] = num_list[num_list.length - 1] * 2;  
		}
	
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 2, 1, 6 })));
		System.out.println(Arrays.toString(solution(new int[] { 5, 2, 1, 7, 5 })));
	}
}