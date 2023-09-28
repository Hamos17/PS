
public class Solution_L0_세균증식 {
	public static int solution(int n, int t) {
		int result = 0;
		for(int i=0;i<=t;i++) {
			if(result == 0) {
				result = n;
			}else {
				result *= 2;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution(2, 10));
		System.out.println(solution(7, 15));
	}
}
