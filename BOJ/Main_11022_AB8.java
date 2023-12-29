import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11022_AB8 {
	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=T;i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			sb.append("Case #").append(i).append(": ").append(A + " + " + B + " = ").append(A + B).append("\n");
		}

		System.out.println(sb.toString().trim());
	}	
}
