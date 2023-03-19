import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1919_애너그램만들기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word1 = br.readLine();
		String word2 = br.readLine();
	
		char[] arr1 = new char[26];
		char[] arr2 = new char[26];
	
		for(int i=0;i<word1.length();i++) {
			arr1[word1.charAt(i) - 97]++;
		}
		
		for(int i=0;i<word2.length();i++) {
			arr2[word2.charAt(i) - 97]++;
		}
		
		int diff = 0;
		for(int i=0;i<26;i++) {
			diff += Math.abs(arr1[i] - arr2[i]);
		}
		
		System.out.print(diff);
	}
}