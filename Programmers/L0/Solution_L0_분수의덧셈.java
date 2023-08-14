import java.util.Arrays;

public class Solution_L0_분수의덧셈 {
	public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int numer = (numer1 * denom2) + (numer2 * denom1);
		int denom = denom1 * denom2;
		
		int gcd = 1;
		int a = numer, b = denom, r = -1;
		while(true) {
			r = (a % b);
			
			if(r == 0) {
				gcd = b;
				break;
			}
			
			a = b;
			b = r;
		}
		
		if(gcd != 1) {
			numer /= gcd;
			denom /= gcd;
		}
		
        return new int[] { numer, denom };
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(1, 2, 3, 4)));
		System.out.println(Arrays.toString(solution(9, 2, 1, 3)));
	}
}
