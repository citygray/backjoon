package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex09 {

	public static void main(String[] args) throws IOException{
		// 별 찍기 - 1

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		
		
		for (int i=0;i<N;i++) {
			for(int j=0;j<=i;j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
	}

}

