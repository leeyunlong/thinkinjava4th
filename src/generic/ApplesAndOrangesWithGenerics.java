package generic;

import java.util.ArrayList;

class Apple {
	private static long counter;
	private final long id = counter++;

	public long id() {
		return id;
	}
}

class Orange {
}

public class ApplesAndOrangesWithGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		// apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++) {
			System.out.print(((Apple) apples.get(i)).id());
		}
		// Using foreach
		for (Apple c : apples) {
			System.out.print(c.id());
		}
	}
}
