import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1157_단어공부 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] word = br.readLine().toUpperCase().toCharArray();
		
		int[] count = new int[26];
		int max = 0;
		
		for(char ch : word) {
			count[ch - 65]++;
			max = Math.max(max, count[ch - 65]);
		}
		
		char ch = ' '; int result = 0;
		for(int i=0;i<26;i++) {
			if(max == count[i]) {
				result++;
				ch = (char)(i + 65);
			}
		}
		
		if(result >= 2) {
			System.out.print("?");
		}else {
			System.out.print(ch);
		}
	}
}