package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex03 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int input = Integer.parseInt(st.nextToken());
		
		if(input%4==0 && (input%100!=0 || input%400==0 )) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
