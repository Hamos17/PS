
public class Solution_L0_공배수 {
	public static int solution(int number, int n, int m) {
		boolean flag = false;
		if(number % n == 0 && number % m == 0) {
			flag = true;
		}

        return flag == true ? 1 : 0;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(60, 2, 3));
		System.out.println(solution(55, 10, 5));
	}
}