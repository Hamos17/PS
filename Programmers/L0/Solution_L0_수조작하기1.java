
public class Solution_L0_수조작하기1 {
	public static int solution(int n, String control) {
		for(char ch : control.toCharArray()) {
			switch (ch) {
			case 'w':
				n++;
				break;
			case 's':
				n--;
				break;
			case 'd':
				n += 10;
				break;
			default:
				n -= 10;
				break;
			}
		}

		return n;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(0, "wsdawsdassw"));
	}
}