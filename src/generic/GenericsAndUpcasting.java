package generic;

import java.util.*;

class FuJi extends Apple{}
class Gala extends Apple{}
class Granny extends Apple{}
public class GenericsAndUpcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Apple> apples = new ArrayList<Apple>();
		apples.add(new FuJi());
		apples.add(new Gala());
		for(Apple c : apples){
			System.out.println(c.id());
		}
	}

}
