import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution_L1_문자열내마음대로정렬하기 {
	public static String[] solution(String[] strings, int n) {
		List<String> list = new ArrayList<>();
		for(String word : strings) {
			list.add(word);
		}
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String word1, String word2) {
				String strCh1 = String.valueOf(word1.charAt(n));
				String strCh2 = String.valueOf(word2.charAt(n));
	
				if(strCh1.equals(strCh2)) {
					return word1.compareTo(word2);
				}
				
				return strCh1.compareTo(strCh2);
			}
		});

		String[] result = new String[list.size()];
		for(int i=0;i<result.length;i++) {
			result[i] = list.get(i);
		}

		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { "sun", "bed", "car" }, 1)));
		System.out.println(Arrays.toString(solution(new String[] { "abce", "abcd", "cdx" }, 2)));
	}
}
