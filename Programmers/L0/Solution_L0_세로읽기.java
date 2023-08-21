import java.util.ArrayList;
import java.util.List;

public class Solution_L0_세로읽기 {
	public static String solution(String my_string, int m, int c) {
		List<String> list = new ArrayList<>();
		for(int i=0;i<my_string.length();i+=m) {
			String subStr = my_string.substring(i, i + m);
			list.add(subStr);
		}

		String result = "";
		for(String word : list) {
			result += word.charAt(c - 1);
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution("ihrhbakrfpndopljhygc", 4, 2));
		System.out.println(solution("programmers", 1, 1));
	}
}
