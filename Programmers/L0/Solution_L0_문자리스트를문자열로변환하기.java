
public class Solution_L0_문자리스트를문자열로변환하기 {
	 public static String solution(String[] arr) {
		 String result = "";
		 for(String str : arr) {
			 result += str;
		 }
		 
		 return result;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(solution(new String[] { "a", "b", "c" }));
	}
}