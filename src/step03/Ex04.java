package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * - 영수증에 적힌, 
		 * 	 구매한 각 물건의 가격과 개수
		 *   구매한 물건들의 총 금액
		 *   을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사
		 *  
		 * - 입력
		 * 첫 줄에는 영수증에 적힌 총 금액 X가 주어진다.
		 * 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
		 * 이후 N개의 줄에는 각 물건의 가격  a와 b가 공백을 사이에 두고 주어진다.
		 * 
		 * - 출력
		 * 구매한 물건의 가격과 개수로 계산한 총 금액이 영수중에 적힌 총 금액과 일치하면 Yes를 출력,
		 * 일치하지 않는다면 No출력
		 * 
		 * - 제한 
		 * 1<= X <= 1000,000,000
		 * 1<= N <= 100
		 * 1<= a <= 1000,000
		 * 1<= b <= 10
		 */

		/*
		260000
		4
		20000 5
		30000 2
		10000 6
		5000 8
		*/
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int X = Integer.parseInt(st.nextToken()); //총 금액
			
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); //물건의 종류의 수
			
			int total =0;
			for(int i = 0;i<N;i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()); //각 물건의 가격
				int b = Integer.parseInt(st.nextToken()); //각 물건의 갯수
				
				total += a*b;
			}
			
			if(X==total) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}catch(IOException e) {
			e.getStackTrace();
		}
	}

}
