import java.util.Arrays;

public class Solution_L0_OX퀴즈 {
	public static String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		for(int i=0;i<answer.length;i++) {
			String[] splits = quiz[i].split(" ");

			int num1 = Integer.parseInt(splits[0]);
			int num2 = Integer.parseInt(splits[2]);

			if("+".equals(splits[1])) {
				int result = num1 + num2;
				if(String.valueOf(result).equals(splits[4])) {
					answer[i] = "O";
				}else {
					answer[i] = "X";
				}
			}else if("-".equals(splits[1])) {
				int result = num1 - num2;
				if(String.valueOf(result).equals(splits[4])) {
					answer[i] = "O";
				}else {
					answer[i] = "X";
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { "3 - 4 = -3", "5 + 6 = 11" })));
		System.out.println(Arrays.toString(solution(new String[] { "19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2" })));
	}
}
