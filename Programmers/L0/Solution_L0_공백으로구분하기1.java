import java.util.Arrays;

public class Solution_L0_공백으로구분하기1 {
	public static String[] solution(String my_string) {
		return my_string.split(" ");
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("i love you")));
		System.out.println(Arrays.toString(solution("programmers")));
	} 

}
