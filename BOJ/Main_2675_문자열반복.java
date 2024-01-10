import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2675_문자열반복 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
	
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
		
			String P = "";
			for(char ch : S.toCharArray()) {
				for(int i=0;i<R;i++) {
					P += ch;
				}
			}
			
			sb.append(P).append("\n");
		}
		
		System.out.println(sb.toString().trim());
	}
}
