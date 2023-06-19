package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EX_01 {

	public static void main(String[] args) throws IOException{
		//N을 입력받은 뒤, 구구단을 N단을 출력하는 프로그램을 작성
		// 입력: 1<=n && n<=9
		// 출력: N*1부터 N*9까지 출력

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		for(int i=1;i<=9;i++) {
			System.out.println(N+" * "+i+" = "+N*i);
		}
	}

}
