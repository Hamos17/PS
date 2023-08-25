
public class Solution_L1_자릿수더하기 {
	public static int solution(int n) {
		String num = Integer.toString(n);
		
		int sum = 0;
		for(Character ch : num.toCharArray()) {
			sum += ch - '0';
		}

		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(123));
		System.out.println(solution(987));
	}
}
