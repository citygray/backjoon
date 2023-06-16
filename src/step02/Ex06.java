package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex06 {

	public static void main(String[] args) throws IOException{
	/**
	 * 입력
	 * 첫째 줄에는 현재 시각이 나온다. 
	 * 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다. 
	 * 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
	 * 
	 * 출력
	 * 첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다. 
	 * (단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다. 
	 * 디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)
	 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st2.nextToken());
		
				
		if(B+C>60) {
			A = A+((B+C)/60);
			B = (B+C)%60;
		}else {
			B = B+C;
		}
		if(A==23&&B==60) {
			A = 0;
			B = 0;
		}
		if(A ==24)A=0;
		
	
		System.out.println(A+" "+B);
		
	}

}
