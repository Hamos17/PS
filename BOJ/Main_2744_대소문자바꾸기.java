import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2744_대소문자바꾸기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] line = br.readLine().toCharArray();

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<line.length;i++) {
			char ch = line[i];
			
			if('A' <= ch && ch <= 'Z') {
				ch += 32;
			}else {
				ch -= 32;
			}
			
			sb.append(ch);
		}
		
		System.out.print(sb.toString().trim());
	}
}