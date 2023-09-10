
public class Solution_L0_정수찾기 {
	public static int solution(int[] num_list, int n) {
		for(int num : num_list) {
			if(num == n) {
				return 1;
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3, 4, 5 }, 3));
		System.out.println(solution(new int[] { 15, 98, 23, 2, 15 }, 20));
	}
}
