import java.util.Scanner;

public class Solution_L0_문자열돌리기 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder sb = new StringBuilder();
        for(Character ch : a.toCharArray()) {
        	sb.append(ch).append("\n");
        }
        
        System.out.print(sb.toString().trim());
	}
}