import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution_L0_접미사배열 {
	public static String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
		
		for(int i=0;i<my_string.length();i++) {
			String word = my_string.substring(i);
			list.add(word);
		}
		
		Collections.sort(list);
		
		String[] result = new String[list.size()];
		for(int i=0;i<result.length;i++) {
			result[i] = list.get(i);
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("banana")));
		System.out.println(Arrays.toString(solution("programmers")));
	}
}
