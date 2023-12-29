import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2525_오븐시계 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int C = Integer.parseInt(st.nextToken());

		int time = A * 60 + B + C;
		
		int HH = time / 60;
		int MM = time - (HH * 60); 
		
		HH %= 24;
		
		System.out.println(HH + " " + MM);
	}
}
