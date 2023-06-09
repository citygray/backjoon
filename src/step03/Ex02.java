package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex02 {

	public static void main(String[] args) {
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
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			
			int T = Integer.parseInt(st1.nextToken());
			
			String str ="";
			for(int i=0;i<T;i++){
				st1 = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st1.nextToken());
				int b = Integer.parseInt(st1.nextToken());
				str += a+b+"\n";
			}
			bw.write(str);
			
			br.close();
			bw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
