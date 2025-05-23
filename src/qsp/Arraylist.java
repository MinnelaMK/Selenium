package qsp;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] MK) {
		ArrayList l = new ArrayList();
		l.add(6);
		l.add(1);
		l.add(2);
		l.add(4);
		l.add(null);
		System.out.println(l);
		System.out.println(l.contains(4));
		System.out.println(l.contains(12));
		l.get(2);
		l.set(0, 66);
		System.out.println(l);
		l.size();
		l.clear();

	}

}
