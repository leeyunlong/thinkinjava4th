package generic;

import java.util.*;

public class SimpleCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> c = new HashSet<Integer>();
		for(int i=0;i<5;i++){
			c.add(i);
		}
		for(int i=0;i<5;i++){
			c.add(i);
		}
		for(Integer cc : c){
			System.out.println(cc+".");
		}
	}

}
