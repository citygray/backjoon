package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex09_10811 {

	public static void main(String[] args) throws IOException{
		// 10811 - 바구니 뒤집기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[M];
		
		for(int l=1;l<=M;l++ ) {
			arr[l-1] = l;
		}

		int i,j;
		
		for(int k=0;k<N;k++) {
			st = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st.nextToken())-1;
			j = Integer.parseInt(st.nextToken())-1;
			
			reverseRange(arr,i,j);
		}
		
		for(int num :arr) {
			System.out.print(num+ " ");
		}

	}
	public static int[] reverseRange(int[] arr, int i,int j) {
		Stack<Integer> stack = new Stack<>();
				
		
		for(int k=i; k<=j ;k++) {
			stack.push(arr[k]);
		}
		
		for(int k=i; k<=j ;k++) {
			arr[k] = stack.pop();
		}
		return arr;
	}

}
