
public class Solution_L0_첫번째로나오는음수 {
	public static int solution(int[] num_list) {
		for(int i=0;i<num_list.length;i++) {
			if(num_list[i] < 0) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 12, 4, 15, 46, 38, -2, 15 }));
		System.out.println(solution(new int[] { 13, 22, 53, 24, 15, 6 }));
	}
}
