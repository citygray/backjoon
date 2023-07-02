package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex06_10813 {

	public static void main(String[] args) throws IOException {
		// 10813 - 공 바꾸기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int temp = 0;
		
		int[] arr = new int[N];
		for(int m = 1;m<=N;m++) {
			arr[m-1] = m;
		}
		
		
		for(int l=0;l<M;l++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken())-1;
			int j = Integer.parseInt(st.nextToken())-1;
			
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		StringBuffer sb = new StringBuffer();
		
		for(int num:arr) {
			sb.append(num).append(" ");
		}
		System.out.println(sb.toString());
	}

}
