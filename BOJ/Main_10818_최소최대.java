import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10818_최소최대 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			int value = Integer.parseInt(st.nextToken());
			
			min = Math.min(min, value);
			max = Math.max(max, value);
		}
		
		System.out.println(min + " " + max);
	}
}
