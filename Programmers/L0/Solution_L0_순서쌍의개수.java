
public class Solution_L0_순서쌍의개수 {
	public static int solution(int n) {
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n % i == 0) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		System.out.println(solution(20));
		System.out.println(solution(100));
	}
}
