
public class Solution_L1_소수찾기 {
	public static int solution(int n) {
		boolean[] primes = new boolean[n + 1];
		primes[0] = primes[1] = true;

		for(int i=2;i<=n;i++) {
			if(!primes[i]) {
				for(int j=i+i;j<=n;j+=i) {
					primes[j] = true;
				}
			}
		}

		int count = 0;
		for(boolean prime : primes) {
			if(!prime) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(5));
		System.out.println(solution(1000000));
	}
}
