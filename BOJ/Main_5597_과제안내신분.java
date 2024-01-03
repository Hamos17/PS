import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_5597_과제안내신분 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		boolean[] arr = new boolean[31];
		
		for(int i=1;i<=28;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[Integer.parseInt(st.nextToken())] = true;
		}
		
		for(int i=1;i<=30;i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
		}
	}
}
