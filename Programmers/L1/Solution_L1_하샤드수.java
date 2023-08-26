
public class Solution_L1_하샤드수 {
	public static boolean solution(int x) {
        String num = String.valueOf(x);
        
        int sum = 0;
        for(Character ch : num.toCharArray()) {
        	sum += (ch - '0');
        }
        
        return x % sum == 0 ? true : false;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(12));
		System.out.println(solution(11));
		System.out.println(solution(13));
	}
}
