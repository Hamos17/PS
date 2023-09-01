import java.util.Scanner;

public class Solution_L1_직사각형별찍기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
