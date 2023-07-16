import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1919_애너그램만들기 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] word1 = br.readLine().toCharArray();
		char[] word2 = br.readLine().toCharArray();

		int[] alphabet1 = new int[26];
		int[] alphabet2 = new int[26];

		for(char ch : word1) {
			alphabet1[ch - 97]++;
		}
		
		for(char ch : word2) {
			alphabet2[ch - 97]++;
		}
		
		int diff = 0;
		for(int i=0;i<26;i++) {
			if(alphabet1[i] != alphabet2[i]) {
				diff += alphabet1[i] > alphabet2[i] ? (alphabet1[i] - alphabet2[i]) : (alphabet2[i] - alphabet1[i]);  
			}
		}
		
		System.out.print(diff);
	}
}