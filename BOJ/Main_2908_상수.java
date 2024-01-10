import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2908_상수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		StringBuilder sb = new StringBuilder();
		int A = Integer.parseInt(sb.append(input[0]).reverse().toString());
		
		sb = new StringBuilder();
		int B = Integer.parseInt(sb.append(input[1]).reverse().toString());

		System.out.println(A > B ? A : B);
	}
}
