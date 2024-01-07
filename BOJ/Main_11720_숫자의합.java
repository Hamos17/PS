import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11720_숫자의합 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		char[] arr = st.nextToken().toCharArray();
	
		int sum = 0;
		for(char ch : arr) {
			sum += (ch - '0');
		}
		
		System.out.println(sum);
	}
}
