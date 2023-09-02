import java.util.Arrays;

public class Solution_L0_세개의구분자 {
	public static String[] solution(String myStr) {
		String[] splits = myStr.split("a|b|c");
		
		int count = 0;
		for(String split : splits) {
			if(!split.equals("")) {
				count++;
			}
		}

		if(count == 0) {
			return new String[] { "EMPTY" };
		}else {
			String[] result = new String[count];
			
			int idx = 0;
			for(int i=0;i<splits.length;i++) {
				if(!splits[i].equals("")) {
					result[idx++] = splits[i];
				}
			}
			
			return result;
		}
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("baconlettucetomato")));
		System.out.println(Arrays.toString(solution("abcd")));
		System.out.println(Arrays.toString(solution("cabab")));
	}
}
