
public class Solution_L0_홀짝에따라다른값반환하기 {
	public static int solution(int n) {
		int answer = 0;
		if(n % 2 == 0) {
			for(int i=1;i<=n;i++) {
				if(i % 2 == 0) {
					answer += (i * i);
				}
			}
		}else {
			for(int i=1;i<=n;i++) {
				if(i % 2 == 1) {
					answer += i;
				}
			}
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(7));
		System.out.println(solution(10));
	}
}