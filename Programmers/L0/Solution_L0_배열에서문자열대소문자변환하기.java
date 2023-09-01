import java.util.Arrays;

public class Solution_L0_배열에서문자열대소문자변환하기 {
	public static String[] solution(String[] strArr) {
		for(int i=0;i<strArr.length;i++) {
			if(i % 2 == 1) {
				strArr[i] = strArr[i].toUpperCase();
			}else {
				strArr[i] = strArr[i].toLowerCase();
			}
		}
		
		return strArr;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { "AAA", "BBB", "CCC", "DDD" })));
		System.out.println(Arrays.toString(solution(new String[] { "aBc", "AbC" })));
	}
}
