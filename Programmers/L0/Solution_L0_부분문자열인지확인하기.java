
public class Solution_L0_부분문자열인지확인하기 {
    public static int solution(String my_string, String target) {
        return my_string.indexOf(target) != -1 ? 1 : 0;
    }
    
    public static void main(String[] args) {
		System.out.println(solution("banana", "ana"));
		System.out.println(solution("banana", "wxyz"));
	}
}
