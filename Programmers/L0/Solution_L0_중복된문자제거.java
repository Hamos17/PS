import java.util.HashSet;

public class Solution_L0_중복된문자제거 {
	public static String solution(String my_string) {
		String[] splits = my_string.split("");
		HashSet<String> hashSet = new HashSet<>();
		
		String result = "";
		for(String split : splits) {
			if(!hashSet.contains(split)) {
				result += split;
				hashSet.add(split);
			}
		}

		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("people"));
		System.out.println(solution("We are the world"));
	}
}
