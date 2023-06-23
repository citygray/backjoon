package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExStringTokenizerEOF {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str;
		String result = st.nextToken();
		
		while(st.hasMoreTokens()) {
			str = st.nextToken();
			if(str.length() >result.length()) {
				result = str;
			}
		}
		System.out.println(result);
	}

}
