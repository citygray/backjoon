package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex05 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int beforeTime = (H*3600)+(M*60);
		int afterTime = beforeTime - (45*60);
		
		int resultH = afterTime/3600;
		int resultM = (int)((afterTime%3600)/60);
		
		if(resultM<0) {
			resultH = 23;
			resultM = 60+(resultM);
		}
		System.out.println(resultH+" "+resultM);
	}

}
