package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex05 {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			
			String str ="";
			for(int i =0; i<N/4;i++) {
				str += "long ";
			}
			str += "int";
			System.out.println(str);
		}catch(IOException e) {
			e.getStackTrace();
		}
		
	}

}
