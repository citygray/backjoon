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
		Arrays.fill(arr,-1);
		for(int i =0; i<10;i++) {
			int k = Integer.parseInt(br.readLine())%42;
			if(contains(arr,k)) {count++;}
			arr[i] = k;
		}
		//System.out.println(Arrays.toString(arr));
		System.out.println(10-count);
		
	}
	public static boolean contains(final int[] arr, final int key) {
		
	        boolean status = false;
	        for (int i = 0; i < arr.length; i++) {
	            status = arr[i]== key;
	            if (status) break;
	        }
	        return status;
	}

}
