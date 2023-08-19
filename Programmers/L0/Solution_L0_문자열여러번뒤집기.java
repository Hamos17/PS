
public class Solution_L0_문자열여러번뒤집기 {
	public static String solution(String my_string, int[][] queries) {
		char[] arr = my_string.toCharArray();
		for(int[] query : queries) {
			int s = query[0];
			int e = query[1];
		
			
			for(int j=s;j<=(s+e)/2;j++) {
				char temp = arr[j];
				arr[j] = arr[s + e - j];
				arr[s + e - j] = temp;
			}
		}
		
		String result = "";
		for(char ch : arr) {
			result += ch;
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("rermgorpsam", new int[][] { { 2, 3 }, { 0, 7 }, { 5, 9 }, { 6, 10 } }));
	}
}
