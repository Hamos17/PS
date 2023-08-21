import java.util.ArrayList;
import java.util.List;

public class Solution_L0_접미사인지확인하기 {
	public static int solution(String my_string, String is_suffix) {
		List<String> list = new ArrayList<>();
		for(int i=0;i<my_string.length();i++) {
			list.add(my_string.substring(i));
		}

		if(list.contains(is_suffix)) {
			return 1;
		}

		return 0;
	}

	public static void main(String[] args) {
		System.out.println(solution("banana", "ana"));
		System.out.println(solution("banana", "nan"));
		System.out.println(solution("banana", "wxyz"));
		System.out.println(solution("banana", "abanana"));
	}
}
