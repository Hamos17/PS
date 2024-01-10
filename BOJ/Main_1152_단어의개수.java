import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1152_단어의개수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().trim().split(" ");
		
		if(input.length == 1 && "".equals(input[0])) {
			System.out.println("0");
		}else {
			System.out.println(input.length);
		}
	}
}
