package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04  {

	public static void main(String[] args){
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] xy = new int[2];
        

        try {
            for(int i =0; i<xy.length;i++) {
            	xy[i] = Integer.parseInt(br.readLine());
            }
          
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int x,y;
		
		x =  xy[0];
		y =  xy[1];
		
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

