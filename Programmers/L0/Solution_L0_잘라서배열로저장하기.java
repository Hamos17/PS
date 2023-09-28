import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_잘라서배열로저장하기 {
	public static String[] solution(String my_str, int n) {
		List<String> list = new ArrayList<>();
		for(int i=0;i<my_str.length();i+=n) {
			if(i + n < my_str.length()) {
				list.add(my_str.substring(i, i + n));
			}else {
				list.add(my_str.substring(i));
			}
		}

		String[] result = new String[list.size()];
		for(int i=0;i<result.length;i++) {
			result[i] = list.get(i);
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6)));
		System.out.println(Arrays.toString(solution("abcdef123", 3)));
	}
}
