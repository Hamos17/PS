import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2480_주사위세개 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int price = 0;
		
		if(A == B && B == C) {
			price = 10000 + (A * 1000);
		}else if(A != B && B != C && A != C) {
			int max = Math.max(A, Math.max(B, C));
			price = max * 100;
		}else if(A == B) {
			if(A != C && B != C) {
				price = 1000 + (A * 100);
			}
		}else if(B == C) {
			if(B != A && C != A) {
				price = 1000 + (B * 100);
			}
		}else if(C == A) {
			if(C != B && A != B) {
				price = 1000 + (C * 100);
			}
		}
		
		System.out.println(price);
	}
}
