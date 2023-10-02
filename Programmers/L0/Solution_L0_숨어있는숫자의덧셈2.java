
public class Solution_L0_숨어있는숫자의덧셈2 {
	public static int solution(String my_string) {
		String str = "";
		for(Character ch : my_string.toCharArray()) {
			if(!('0' <= ch && ch <= '9')) {
				str += 'A';
			}else {
				str += ch;
			}
		}

		String[] arr = str.split("A");

		int sum = 0;
		boolean flag = false;

		for(String val : arr) {
			if(!"".equals(val)) {
				sum += Integer.parseInt(val);
				flag = true;
			}
		}

		if(!flag) {
			return 0;
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println(solution("aAb1B2cC34oOp"));
		System.out.println(solution("1a2b3c4d123Z"));
	}
}
