package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex10 {

	public static void main(String[] args) throws IOException{
		// 별 찍기 - 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=N;i++) {
			for(int j=0; j<N;j++) {
				if(N-i>j) {
					bw.write(" ");
				}else {
					bw.write("*");
				}
			}
			bw.write("\n");
		}
		bw.flush();
		
	}

}
