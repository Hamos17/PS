
public class Solution_L0_특정문자제거하기 {
	public static String solution(String my_string, String letter) {
		my_string = my_string.replaceAll(letter, "");
        return my_string;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("abcdef", "f"));
		System.out.println(solution("BCBdbe", "B"));
	}
}
