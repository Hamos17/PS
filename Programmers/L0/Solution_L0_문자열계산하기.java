
public class Solution_L0_문자열계산하기 {
	public static int solution(String my_string) {
		String[] splits = my_string.split(" ");

		int result = 0;
		for(int i=0;i<splits.length;i++) {
			if(i == 0) {
				result = Integer.parseInt(splits[i]);
				continue;
			}

			if("+".equals(splits[i])) {
				result += Integer.parseInt(splits[i + 1]);
				i++;
			}

			if("-".equals(splits[i])) {
				result -= Integer.parseInt(splits[i + 1]);
				i++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution("3 + 4"));
	}
}
