import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10989_수정렬하기3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];

		while(N-- > 0) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=10000;i++) {
			while(arr[i]-- > 0) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.print(sb);
	}
}