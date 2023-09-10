import java.math.BigInteger;

public class Solution_L0_두수의합2 {
	public static String solution(String a, String b) {
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
		
        return A.add(B).toString();
    }
	
	public static void main(String[] args) {
		System.out.println(solution("582", "734"));
		System.out.println(solution("18446744073709551615", "287346502836570928366"));
		System.out.println(solution("0", "0"));
	}
}
