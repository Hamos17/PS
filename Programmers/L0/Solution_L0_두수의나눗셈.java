
public class Solution_L0_두수의나눗셈 {
	public static int solution(int num1, int num2) {
        double result = ((1.0 * num1) / num2);
		result *= 1000;
		
        return (int)(result);
    }
	
	public static void main(String[] args) {
		System.out.println(solution(3, 2));
		System.out.println(solution(7, 3));
	}
}