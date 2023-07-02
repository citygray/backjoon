package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex07_5597 {

	public static void main(String[] args) throws IOException{
		// 5597 - 과제 안 내신 분..?
		int[] arr = new int[28];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i =0; i<28;i++) {
			arr[i] = Integer.parseInt(br.readLine());		
		}
		
		Arrays.parallelSort(arr);
		
		for(int j = 1; j<=30;j++) {
			if(Arrays.binarySearch(arr, j)<0) {
				System.out.println(j);
			}
		}

	}

}
