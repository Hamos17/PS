import java.util.Arrays;

public class Solution_L1_자연수뒤집어배열로만들기 {
	public static int[] solution(long n) {
        String num = String.valueOf(n);
        
        int[] result = new int[num.length()];
        for(int i=0;i<result.length;i++) {
        	result[i] = num.charAt(num.length() - i - 1) - '0';
        }
		
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(12345)));
	}
}
