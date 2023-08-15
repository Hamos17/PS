
public class Solution_L1_두정수사이의합 {
	public static long solution(int a, int b) {
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		long result = 0;
		for(int i=a;i<=b;i++) {
			result += i;
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(3, 5));
		System.out.println(solution(3, 3));
		System.out.println(solution(5, 3));
	}
}