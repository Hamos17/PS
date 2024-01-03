import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2562_최댓값 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[] arr = new int[9];
		
		for(int i=0;i<9;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int idx = -1, max = Integer.MIN_VALUE;
		for(int i=0;i<9;i++) {
			if(max < arr[i]) {
				idx = i;
				max = arr[i];
			}
		}
		
		System.out.println(max + "\n" + (idx + 1));
	}
}
