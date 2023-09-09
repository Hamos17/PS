import java.util.Arrays;

public class Solution_L0_뒤에서5등위로 {
	public static int[] solution(int[] num_list) {
		Arrays.sort(num_list);
		
		int[] result = new int[num_list.length - 5];
		for(int i=0;i<result.length;i++) {
			result[i] = num_list[i + 5];
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 12, 4, 15, 46, 38, 1, 14, 56, 32, 10 })));
	} 
}	
