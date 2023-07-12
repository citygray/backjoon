package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10_1546 {

	public static void main(String[] args) throws IOException{
		// 1546 - 평균
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); 
		
		//과목수 배열 만들기
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0;i <N;i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		//최대값 구하기
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) max = arr[i];
		}
		
		//System.out.println(max);
		//평균값 구하기
		
		float sum = 0;
		for(int num:arr) {
			//System.out.println((float)num/max*100);
			sum += (float)num/max*100;
		}
		float avg = sum/N;
		
		System.out.println(avg);

	}

}
