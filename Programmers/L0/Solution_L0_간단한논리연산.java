
public class Solution_L0_간단한논리연산 {
	public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
		boolean result1 = (x1 == false && x2 == false) ? false : true;
		boolean result2 = (x3 == false && x4 == false) ? false : true;

		return (result1 == true && result2 == true) ? true : false;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(false, true, true, true));
		System.out.println(solution(true, false, false, false));
	}
}
