package step03;

import java.io.*;
import java.util.*;

public class Ex06 {

	public static void main(String[] args) throws IOException{
		/* 
		* - 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성한다.
		* - 입력 
		* 첫줄에 테스트 케이스의 개수 T가 주어진다.
		* 각 테스트 케이스는 한줄로 이루어져 있으며, 각 중에 A와 B가 주어진다.
		* (0<A,B<10)
		* 
		* - 출력
		* 각 테스트 케이스 마다  A+B를 출력한다.
		*/
		
		//입력: BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		//readLine을 할때 마다 try&catch를 활용하여 예외처리 해주어도 되지만, 대개  throws IoException
			
			StringTokenizer st;
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			for(int i=0;i<T;i++){
				st = new StringTokenizer(br.readLine()); //StringTokenizer인자값에 입력문자열 넣음
				int a = Integer.parseInt(st.nextToken()); //첫번재 호출
				int b = Integer.parseInt(st.nextToken()); //두번째 호출
				
				bw.write(a+b+"\n"); 
			}					
			bw.flush(); //남아있는 데이터를 모두 출력
	
	}

}
