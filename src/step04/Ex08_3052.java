package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex08_3052 {

	public static void main(String[] args) throws IOException{
		// 3052 - 나머지
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		for(int i =0; i<10;i++) {
			arr[i]= Integer.parseInt(br.readLine())%42;
		}
		System.out.println(Arrays.toString(arr));
		
		Arrays.parallelSort(arr);
		
		for(int i = 0; i<10;i++) {
			if(Arrays.binarySearch(arr,arr[i] )>0) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
