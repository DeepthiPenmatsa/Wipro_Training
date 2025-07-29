package Day9;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collection_set_Tree {
	public static void main(String[]args) {
		Set<Integer>setData=new TreeSet<Integer>();
		setData.add(50);
		setData.add(60);
		setData.add(80);
		setData.add(80);
		System.out.println(setData);
		Iterator<Integer> iterator=setData.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
	
	}

}
