package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex07 {

	public static void main(String[] args) throws IOException{
		/*
		 * 1에서 부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
		 * 
		 * 1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)*1,000원의 상금을 받게 된다.
		 * 2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)*100의 상금을 받게 된다.
		 * 3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)*100의 상금을 받게 된다.
		 */
		
		/*
		 * 예를 들어, 
		 * 3개의 눈 3,3,6이 주어지면 상금은 1,000+3*100으로 계산 되어 1,300을 받게 된다.
		 * 3개의 눈 2,2,2로 주어지면 상금은 10,000+2*1,000으로 계산되어 12,000을 받게 된다.
		 * 3개의 눈 6,2,5로 주어지면 그중 가장 큰 값이 6이므로 6*100으로 계산되어 600원을 받게된다.
		 * */
		
		/*
		 * 입력 3 3 6
		 * 출력 1300
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int result = 0;
		if(A==B && B==C) {
			result = 10000+(A*1000);
		}else if(A!=B && B!=C && A!=C) {
			result = (Math.max(Math.max(A,B),C))*100;
		}else {
			int sameNum = 0;
			if(A==B) sameNum = A; 
			if(B==C) sameNum = B;
			if(A==C) sameNum = C;
			
			result = 1000+(sameNum*100);
		}
		
		System.out.println(result);
	}

}
