package Day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable_Collections {
	public static void main(String[]args) {
		Comparator<Integer> c=new Comparator<Integer>() {
			public int compare(int i,int j) {
				if(i%10 > j%10) 
					return 1;
				else if(i%10<j%10) 
					return -1;
				else
					return 0;
			}

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		List<Integer> list= new ArrayList<>();
		list.add(80);
		list.add(95);
		list.add(90);
		list.add(85);
		System.out.println(list);
		Collections.sort(list,c);
		System.out.println(list);
		
	}

}
