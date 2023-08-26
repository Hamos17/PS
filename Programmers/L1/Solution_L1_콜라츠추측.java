
public class Solution_L1_콜라츠추측 {
	public static int solution(long num) {
		if(num == 1) {
			return 0;
		}
		
		int count = 0;
		while(true) {
			if(num == 1) {
				break;
			}
			
			if(count >= 500) {
				return -1;
			}

			count++;
			
			if(num % 2 == 0) {
				num /= 2;
			}else {
				num *= 3;
				num += 1;
			}
			
		}
		
		return count;
	}

	public static void main(String[] args) {
		System.out.println(solution(6));
		System.out.println(solution(16));
		System.out.println(solution(626331));
	}
}
