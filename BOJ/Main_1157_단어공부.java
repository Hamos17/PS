import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1157_단어공부 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toUpperCase();
		
		int[] count = new int[26];
		for(int i=0;i<word.length();i++) {
			count[word.charAt(i) - 65]++;
		}
		
		int idx = -1, max = 0;
		for(int i=0;i<26;i++) {
			if(max < count[i]) {
				idx = i;
				max = count[i];
			}
		}
		
		boolean flag = false;
		for(int i=0;i<26;i++) {
			if(i == idx) continue;
			
			if(max == count[i]) {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.print("?");
		}else {
			System.out.print((char)(idx + 65));
		}
	}
}