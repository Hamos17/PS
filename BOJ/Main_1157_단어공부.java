import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1157_단어공부 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] inputs = br.readLine().toUpperCase().toCharArray();
	
		int[] count = new int[26];
		for(char ch : inputs) {
			count[ch - 65]++;
		}
		
		char maxCh = ' ';
		int max = 0;
		
		for(int i=0;i<26;i++) {
			if(max < count[i]) {
				max = max < count[i] ? count[i] : max;
				maxCh = (char)(i + 65);
			}
		}

		boolean isDuplication = false;
		for(int i=0;i<26;i++) {
			if(count[i] == max && (char)(i + 65) != maxCh) {
				isDuplication = true;
				break;
			}
		}
		
		if(isDuplication) {
			System.out.println("?");
		}else {
			System.out.println(maxCh);
		}
	}
}
