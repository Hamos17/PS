import java.util.ArrayList;
import java.util.List;

public class Solution_L0_접두사인지확인하기 {
	public static int solution(String my_string, String is_prefix) {
        List<String> list = new ArrayList<>();
		for(int i=0;i<my_string.length();i++) {
			list.add(my_string.substring(0, i));
		}
		
		if(list.contains(is_prefix)) {
			return 1;
		}

		return 0;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("banana", "ban"));
		System.out.println(solution("banana", "nan"));
		System.out.println(solution("banana", "abcd"));
		System.out.println(solution("banana", "bananan"));
	}
}
