
public class Solution_L0_1로만들기 {
	public static int solution(int[] num_list) {
		int result = 0;
		for(int num : num_list) {
			
			int count = 0;
			while(num != 1) {
				count++;
				
				if(num % 2 == 0) {
					num /= 2;
				}else {
					num -= 1;
					num /= 2;
				}
			}
			
			result += count;
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 12, 4, 15, 1, 14 }));
	}
}
