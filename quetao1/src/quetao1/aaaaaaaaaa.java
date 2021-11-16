package quetao1;

import java.util.Arrays;

public class aaaaaaaaaa {

	public static void main(String[] args) {
		
		int[] Acerto = new int[10];		
		int[] Desperto = new int[10];
		Arrays.fill(Acerto, 5);
		Arrays.fill(Desperto, 10);
		int y=0;
		for (int i = 0; i < Acerto.length; i++) {
			y = y + Acerto[i]+Acerto[i];
			
			
			System.out.println(y);
		}
		
	}

}
