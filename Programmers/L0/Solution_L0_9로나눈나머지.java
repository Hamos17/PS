
public class Solution_L0_9로나눈나머지 {
	public static int solution(String number) {
		int sum = 0;
		for(Character num : number.toCharArray()) {
			sum += num - '0';
		}
		
		return (sum % 9);
	}
	
	public static void main(String[] args) {
		System.out.println(solution("123"));
		System.out.println(solution("78720646226947352489"));
	}
}
