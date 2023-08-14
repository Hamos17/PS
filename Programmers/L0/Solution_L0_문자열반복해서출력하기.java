import java.util.Scanner;

public class Solution_L0_문자열반복해서출력하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int n = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		while(n-- > 0) {
			sb.append(str);
		}
		
		System.out.print(sb.toString());
	}
}