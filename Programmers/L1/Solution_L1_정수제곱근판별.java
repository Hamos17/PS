
public class Solution_L1_정수제곱근판별 {
	public static long solution(long n) {
		double sqrt1 = Math.sqrt(n);
		long sqrt2 = (long)Math.sqrt(n);
		
		if(sqrt1 == (double) sqrt2) {
			return (long) Math.pow(sqrt1 + 1, 2);
		}
		
		/* 제곱근 판별 */
		// if(Math.pow((int) Math.sqrt(n), 2) == n)
		
        return -1;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(121));
		System.out.println(solution(1000000000000L));
		System.out.println(solution(3));
	}
}
