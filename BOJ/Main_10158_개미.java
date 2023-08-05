import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10158_개미 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int P = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int T = Integer.parseInt(st.nextToken());

		P += T % (2 * W);
		Q += T % (2 * H);
	
		if(P > W) {
			P = Math.abs((2 * W) - P);
		}
		
		if(Q > H) {
			Q = Math.abs((2 * H) - Q);
		}
	
		System.out.print(P + " " + Q);
	}
}