package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex01_10807 {
	
	public static void main(String[] args) throws IOException {
		// 10807 - 개수 세기
		
		//첫번째줄 : 입력받을 정수의 개수
		//두번째줄 : 개수만큼 받은 정수 (-100<- X <= 100)
		//세번째줄 : 찾을려는 정수 (-100<- X <= 100)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//첫번째줄 : 입력받을 정수의 개수 X
		int X = Integer.parseInt(br.readLine());
		
		//두번째줄 : X개수만큼 받은 정수 (-100<- X <= 100)
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<X;i++) {
			sb.append(st.nextToken()).append(" ");
		}
		//세번째줄 : 찾을려는 정수 (-100<- X <= 100)
		int Y = Integer.parseInt(br.readLine());
		
		
		System.out.println("----------------------");
		System.out.println("입력받을 정수의 개수: "+X);
		System.out.println("입력한 정수"+sb.toString());
		System.out.println("찾을려는 정수: "+Y);
	}

}
