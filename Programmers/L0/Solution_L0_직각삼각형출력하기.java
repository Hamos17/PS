import java.util.Scanner;

public class Solution_L0_직각삼각형출력하기 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=i;j++) {
        		sb.append("*");
        	}
        	
        	sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }
}
