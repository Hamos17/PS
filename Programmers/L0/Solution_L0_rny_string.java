
public class Solution_L0_rny_string {
	public static String solution(String rny_string) {
        return rny_string.replaceAll("m", "rn");
    }
	
	public static void main(String[] args) {
		System.out.println(solution("masterpiece"));
		System.out.println(solution("programmers"));
		System.out.println(solution("jerry"));
		System.out.println(solution("burn"));
	}
}
