import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Node {
	int idx;
	int value;
	
	public Node(int idx, int value) {
		this.idx = idx;
		this.value = value;
	}
}

public class Main_11003_최솟값찾기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 출력을 버퍼에 넣고 한 번에 출력하기 위해 BufferedWriter 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		Deque<Node> deque = new LinkedList<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=1;i<=N;i++) {
			int cur = Integer.parseInt(st.nextToken());
			
			// 새 값이 들어올 때마다 정렬 대신 현재 수보다 큰 값을 덱에서 제거해 시간복잡도 줄이기
			while(!deque.isEmpty() && deque.getLast().value > cur) {
				deque.pollLast();
			}
			
			deque.offerLast(new Node(i+1, cur));
			
			// 범위에서 벗어난 값은 덱에서 제거
			if(deque.getFirst().idx <= i-L+1) {
				deque.pollFirst();
			}
			
			bw.write(deque.getFirst().value + " ");
		}
		
		bw.flush();
		bw.close();
	}
}