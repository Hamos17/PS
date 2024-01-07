import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1546_평균 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		double[] arr = new double[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		double M = -1.0;
		for(int i=0;i<N;i++) {
			arr[i] = Double.parseDouble(st.nextToken());
			M = Math.max(M, arr[i]);
		}
		
		double sum = 0.0;
		for(int i=0;i<N;i++) {
			arr[i] = arr[i] / M * 100;
			sum += arr[i];
		}
		
		double avg = sum / N;
		System.out.println(avg);
	}
}
