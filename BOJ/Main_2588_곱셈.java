import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2588_곱셈 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int B = Integer.parseInt(st.nextToken());
		
		char[] num = String.valueOf(B).toCharArray();
		for(int i=num.length - 1;0<=i;i--) {
			System.out.println(A * (num[i] - '0'));
		}
		
		System.out.println(A * B);
	}
}
