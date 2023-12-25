import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_25314_코딩은체육과목입니다 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int count = N / 4;
		
		String result = "int";
		while(count-- > 0) {
			result = "long " + result; 
		}
		
		System.out.println(result);
	}
}
