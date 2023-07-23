import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1543_문서검색 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String doc = br.readLine();
		String word = br.readLine();
		
		int length = word.length();
		int count = 0;

		while(true) {
			int idx = doc.indexOf(word);
			
			if(idx == -1) {
				break;
			}
			
			count++;

			doc = doc.substring(idx + length);
		}
		
		System.out.print(count);
	}
}