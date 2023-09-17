
public class Solution_L0_한번만등장한문자 {
	public static String solution(String s) {
		int[] count = new int[26];
		for(Character ch : s.toCharArray()) {
			count[ch - 97]++;
		}

		String result = "";
		for(int i=0;i<26;i++) {
			if(count[i] == 1) {
				result += (char)(i + 97);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution("abcabcadc"));
		System.out.println(solution("abdc"));
		System.out.println(solution("hello"));
	}
}
