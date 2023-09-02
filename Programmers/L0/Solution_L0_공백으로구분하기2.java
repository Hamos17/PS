import java.util.Arrays;

public class Solution_L0_공백으로구분하기2 {
	public static String[] solution(String my_string) {
		String[] splits = my_string.trim().split(" ");
		
		int count = 0;
		for(String split : splits) {
			if(!split.equals("")) {
				count++;
			}
		}

		String[] result = new String[count];
		
		int idx = 0;
		for(int i=0;i<splits.length;i++) {
			if(!splits[i].equals("")) {
				result[idx++] = splits[i];
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(" i    love  you")));
		System.out.println(Arrays.toString(solution("    programmers  ")));
	}
}
