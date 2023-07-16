import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2744_대소문자바꾸기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		char[] words = br.readLine().toCharArray();
		
		StringBuilder sb = new StringBuilder();
		for(char word : words) {
			if('A' <= word && word <= 'Z') {
				sb.append((char)(word + 32));
			}
			
			if('a' <= word && word <= 'z') {
				sb.append((char)(word - 32));
			}
		}
		
		System.out.print(sb.toString().trim());
	}
}