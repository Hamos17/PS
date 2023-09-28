
public class Solution_L0_숫자찾기 {
	public static int solution(int num, int k) {
		String strNum = String.valueOf(num);
		String strK = String.valueOf(k);

		int idx = strNum.indexOf(strK);

		return idx != -1 ? idx + 1 : -1;
	}

	public static void main(String[] args) {
		System.out.println(solution(29183, 1));
		System.out.println(solution(232443, 4));
		System.out.println(solution(123456, 7));
	}
}
