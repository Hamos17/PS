import java.util.Arrays;

public class Solution_L1_최대공약수와최소공배수 {
	public static int[] solution(int n, int m) {
		int gcd = 0, lcm = 0;
		
		for(int i=1;i<=n;i++) {
			if(n % i == 0 && m % i == 0) {
				gcd = i;
			}
		}
		
		lcm = (n * m) / gcd;

		return new int[] { gcd, lcm };
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3, 12)));
		System.out.println(Arrays.toString(solution(2, 5)));
	}
}
