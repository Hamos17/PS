
public class Solution_L0_문자열뒤집기_기초 {
	public static String solution(String my_string, int s, int e) {
        char[] arr = my_string.toCharArray();
		
		for(int i=s;i<=(s+e)/2;i++) {
			char temp = arr[i];
			arr[s++] = arr[e]; 
			arr[e--] = temp;
		}
		
		String result = "";
		for(char ch : arr) {
			result += ch;
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("Progra21Sremm3", 6, 12));
		System.out.println(solution("Stanley1yelnatS", 4, 10));
	}
}
