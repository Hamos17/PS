import java.util.Arrays;

public class Solution_L0_짝수홀수개수 {
	 public static int[] solution(int[] num_list) {
		 int even = 0;
		 int odd = 0;
		 
		 for(int num : num_list) {
			 if(num % 2 == 0) {
				 even++;
			 }else {
				 odd++;
			 }
		 }
		 
		 return new int[] { even, odd };
	 }
	 
	 public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 3, 4, 5 })));
		System.out.println(Arrays.toString(solution(new int[] { 1, 3, 5, 7 })));
	}
}
