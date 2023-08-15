
public class Solution_L0_주사위게임2 {
	public static int solution(int a, int b, int c) {
		int result = 0;
		
		if(a != b && b != c && c != a) {
			result = a + b + c;
		}else if(a == b && b == c && c == a) {
			result = (a + b + c) * ((a * a) + (b * b) + (c * c)) * ((a * a * a) + (b * b * b) + (c * c * c)); 
		}else {
			result = (a + b + c) * ((a * a) + (b * b) + (c * c));
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(2, 6, 1));
		System.out.println(solution(5, 3, 3));
		System.out.println(solution(4, 4, 4));
	}
}