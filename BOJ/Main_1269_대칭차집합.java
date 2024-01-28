import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main_1269_대칭차집합 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		TreeSet<Integer> treeSetA = new TreeSet<>();
		TreeSet<Integer> treeSetB = new TreeSet<>();
	
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<A;i++) {
			treeSetA.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<B;i++) {
			treeSetB.add(Integer.parseInt(st.nextToken()));
		}

		int countA = 0, countB = 0;
		for(Integer key : treeSetA) {
			if(!treeSetB.contains(key)) {
				countA++;
			}
		}
		
		for(Integer key : treeSetB) {
			if(!treeSetA.contains(key)) {
				countB++;
			}
		}
		
		System.out.println(countA + countB);
	}
}
