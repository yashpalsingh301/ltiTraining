import java.util.*;
public class Ch_91 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4};
		System.out.println(a.length);
		
		ArrayList<Integer> l1= new ArrayList<>();
		ArrayList<Integer> l2= new ArrayList<>();
		l2.add(30);
		l2.add(45);
		l1.add(12);
		l1.add(14);
		l1.add(34);
		l2.addAll(l1);
//		l2.remove(3);
		l2.add(3,6);
		for (int i=0; i<l2.size(); i++){
			System.out.println(l2.get(i));
		}
		

	}

}
