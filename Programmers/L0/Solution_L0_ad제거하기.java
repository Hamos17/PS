import java.util.Arrays;

public class Solution_L0_ad제거하기 {
	 public static String[] solution(String[] strArr) {
		 int count = 0;
		 for(String str : strArr) {
			 if(!str.contains("ad")) {
				 count++;
			 }
		 }
		 
		 String[] result = new String[count];
	
		 int idx = 0;
		 for(int i=0;i<strArr.length;i++) {
			 if(!strArr[i].contains("ad")) {
				 result[idx++] = strArr[i];
			 }
		 }
		 
		 return result;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { "and", "notad", "abcd" })));
		System.out.println(Arrays.toString(solution(new String[] { "there", "are", "no", "a", "ds" })));
	}
}
