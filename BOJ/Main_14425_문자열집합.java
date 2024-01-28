import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main_14425_문자열집합 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	
		TreeSet<String> treeSet = new TreeSet<>();
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			String word = st.nextToken();
			
			treeSet.add(word);
		}
		
		int count = 0;
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			String word = st.nextToken();
			
			if(treeSet.contains(word)) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
