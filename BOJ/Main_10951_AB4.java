import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10951_AB4 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		StringBuilder sb = new StringBuilder();
		
		String input = "";
		while((input = br.readLine()) != null) {
			if(input.length() == 0) {
				break;
			}
			
			String[] splits = input.split(" ");
			
			int A = Integer.parseInt(splits[0]);
			int B = Integer.parseInt(splits[1]);
		
			sb.append(A + B).append("\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}
