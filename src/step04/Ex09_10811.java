package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
		//System.out.println(Arrays.toString(arr));
		
		for(int k=0;k<N;k++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			//reverseRange(arr,i,j);
			System.out.println(Arrays.toString(reverseRange(arr,i,j)));
			
			
		}

	}
	public static int[] reverseRange(int[] arr, int i,int j) {
		int[] copiedArr = Arrays.copyOfRange(arr, i, j);
		int[] reverseArr = new int[copiedArr.length+1];
		
		//System.out.println(reverseArr);
		
		
		for(int k=reverseArr.length; k>=0 ;k--) {
			int n = (k-reverseArr.length)*-1;
			System.out.println("k-n: "+k+"-"+n);
			reverseArr[n] = copiedArr[k];
		}
		return reverseArr;
	}

}
