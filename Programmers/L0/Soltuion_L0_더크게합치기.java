
public class Soltuion_L0_더크게합치기 {
	public static int solution(int a, int b) {
		String result1 = "";
		result1 = String.valueOf(a);
		result1 += String.valueOf(b);
		
		String result2 = "";
		result2 = String.valueOf(b);
		result2 += String.valueOf(a);
		
        return Integer.parseInt(result1) >= Integer.parseInt(result2) ? Integer.parseInt(result1) : Integer.parseInt(result2);
    }
	
	public static void main(String[] args) {
		System.out.println(solution(9, 91));
		System.out.println(solution(89, 8));
	}
}