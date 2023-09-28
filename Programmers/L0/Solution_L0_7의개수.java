
public class Solution_L0_7의개수 {
	public static int solution(int[] array) {
		int count = 0;
		for(int num : array) {
			String strNum = String.valueOf(num);

			for(Character ch : strNum.toCharArray()) {
				if(ch == '7') {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 7, 77, 17 }));
		System.out.println(solution(new int[] { 10, 29 }));
	}
}
