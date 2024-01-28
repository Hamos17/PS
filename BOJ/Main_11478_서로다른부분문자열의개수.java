import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_11478_서로다른부분문자열의개수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String S = st.nextToken();
		
		HashSet<String> hashSet = new HashSet<>();
		for(int i=0;i<S.length();i++) {
			for(int j=i;j<S.length();j++) {
				String piece = S.substring(i, j + 1);
				hashSet.add(piece);
			}
		}
	
		System.out.println(hashSet.size());
	}
}
