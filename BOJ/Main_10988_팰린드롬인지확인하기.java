import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10988_팰린드롬인지확인하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		
		if(input.equals(sb.reverse().toString())) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}
