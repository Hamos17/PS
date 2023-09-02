import java.util.Arrays;

public class Solution_L0_x사이의개수 {
	public static int[] solution(String myString) {
		String[] str = myString.split("x");
		
		int[] result = null;
		if(myString.charAt(myString.length() - 1) == 'x') {
			result = new int[str.length + 1];
			for(int i=0;i<str.length;i++) {
				int len = str[i].length();
				result[i] = len;
			}
			
		}else {
			result = new int[str.length];
			for(int i=0;i<str.length;i++) {
				int len = str[i].length();
				result[i] = len;
			}
		}

        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("oxooxoxxox")));
		System.out.println(Arrays.toString(solution("xabcxdefxghi")));
	}
}
