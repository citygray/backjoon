package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex01_10807 {
	
	public static void main(String[] args) throws IOException {
		// 10807 - 개수 세기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr;
		
		//첫번째줄 : 입력받을 정수의 개수 X
		int X = Integer.parseInt(br.readLine());
		arr = new int[X];
		
		//두번째줄 : X개수만큼 받은 정수 (-100<- X <= 100)
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<X;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		//세번째줄 : 찾을려는 정수 (-100<- X <= 100)
		int Y = Integer.parseInt(br.readLine());
		int count =0;
		for(int num:arr) {
			if(num==Y) count++;
		} 
		
		
		System.out.println("----------------------");
		System.out.println("입력받을 정수의 개수: "+X);
		System.out.println("입력한 정수"+Arrays.toString(arr));
		System.out.println("찾을려는 정수: "+Y);
		System.out.println("정수 중에 Y가 몇 개인지 "+count);
	}
}
