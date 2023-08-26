
public class Solution_L0_팩토리얼 {
	public static int solution(int n) {
		int result = 0;
		for(int i=1;i<=10;i++) {
			int fact = 1;
			for(int j=1;j<=i;j++) {
				fact *= j;
			}
			
			if(fact <= n) {
				result = i;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution(3628800));
		System.out.println(solution(7));
	}
}
