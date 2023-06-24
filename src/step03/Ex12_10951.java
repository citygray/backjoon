package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex12_10951 {

	public static void main(String[] args) throws IOException{
		/*
		 * 문제 - 10951 A+B-4 EoF

		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
 
		while( (str=br.readLine()) != null && !str.isEmpty()){
		    /* !str.isEmpty() 넣는 이유
		     * IDE 터미널 창에서는 입력의 끝이 없다.입력을 계속 기다리는 상태이기 때문에 
		     *EOF를 명시 해주지 않으면 프로그램이 끝나않는다.
		     * */
			
			
			StringTokenizer st = new StringTokenizer(str, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a+b).append("\n");
		
		}
		System.out.print(sb);
		
	}

	

}
 