package collec;

import java.util.ArrayList;
import java.util.List;

public class COLLEC_main {

	public static void main(String[] args) {
		int i = 25;
		
		List<Integer> l = new ArrayList<>();
		
		while(i>= 0) {
			
			i=i/2;
			l.add(i);
			if(i==0) {
				break;
			}
		}
		System.out.println(l);

	}

}
