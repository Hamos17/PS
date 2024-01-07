import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10809_알파벳찾기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		String S = st.nextToken();
		
		int[] arr = new int[26];
		Arrays.fill(arr, -1);

		for(int i=0;i<S.length();i++) {
			if(arr[S.charAt(i) - 97] == -1) {
				arr[S.charAt(i) - 97] = i;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int idx : arr) {
			sb.append(idx).append(" ");
		}
		
		System.out.println(sb.toString().trim());
	}
}
