package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04  {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		int quadrant = 0;
		if(x>0) {
			if(y>0) {
				quadrant = 1;	
			}else {
				quadrant = 4;	
			}
		}else {
			if(y>0) {
				quadrant = 2;	
			}else {
				quadrant = 3;	
			}
		}
		System.out.println(quadrant);
		
	}

}

