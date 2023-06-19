package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * - n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램
		 * - 입력
		 * 첫째 줄에 n(1<=n<=10,000)이 주어진다.
		 * - 출력
		 * 1부터 n까지 합을 출력한다.
		 */

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int total = 0;
			for(int i = 1; i<=n;i++) {
				total += i;
			}
			
			System.out.println(total);
		}catch(IOException e) {
			e.getStackTrace();
		}
		
	}

}
