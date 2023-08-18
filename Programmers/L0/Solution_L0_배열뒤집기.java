import java.util.Arrays;

public class Solution_L0_배열뒤집기 {
	public static int[] solution(int[] num_list) {
		for(int i=0;i<num_list.length/2;i++) {
			int temp = num_list[i];
			num_list[i] = num_list[num_list.length - i - 1];
			num_list[num_list.length - i - 1] = temp;
		}
	
		return num_list;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 3, 4, 5 })));
		System.out.println(Arrays.toString(solution(new int[] { 1, 1, 1, 1, 1, 2 })));
		System.out.println(Arrays.toString(solution(new int[] { 1, 0, 1, 1, 1, 3, 5 })));
	}
}