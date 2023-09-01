
public class Solution_L0_길이에따른연산 {
	public static int solution(int[] num_list) {
		int result = 0;
		if(num_list.length >= 11) {
			for(int num : num_list) {
				result += num;
			}
		}else if(num_list.length <= 10) {
			result = num_list[0];
			
			for(int i=1;i<num_list.length;i++) {
				result *= num_list[i];
			}
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1 }));
		System.out.println(solution(new int[] { 2, 3, 4, 5 }));
	}
}
