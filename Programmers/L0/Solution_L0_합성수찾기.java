
public class Solution_L0_합성수찾기 {
	public static int solution(int n) {
		int result = 0;
		for(int i=1;i<=n;i++) {
			int count = 0;
			for(int j=1;j<=i;j++) {
				if(i % j == 0) {
					count++;
				}
			}
			
			if(count >= 3) {
				result++;
			}
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(15));
	}
}
