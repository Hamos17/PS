
public class Solution_L0_이어붙인수 {
	public static int solution(int[] num_list) {
		String str1 = "";
		String str2 = "";
		
		for(int num : num_list) {
			if(num % 2 == 0) {
				str1 += num;
			}else {
				str2 += num;
			}
		}
		
		return Integer.parseInt(str1) + Integer.parseInt(str2);
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 3, 4, 5, 2, 1 }));
		System.out.println(solution(new int[] { 5, 7, 8, 3 }));
	}
}