import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Duplicatearray {

	public static void main(String[] args) {
		/*int a[] = {1,2,5,9,8,2,9,6,7,6,7};
		Set<Integer> s = new HashSet();
		for(int i =0 ; i<a.length ; i++ )
		{
		s.add(a[i])	;
		}
		System.out.println(s);

	}
*/

		List<Integer> s = new ArrayList();
	int a[] = {1,2,8,0};
	int b[] = {1,2,5,9};
	for(int i =0 ; i< b.length;i++) {
		if(a[i] == b[i]) {
		continue;	
		}else {
			s.add(a[i]);
			s.add(b[i]);
		}
	}
  System.out.println(s);
}
	//output = {1,1,2,2,5,9}
	
//output ={1,2,5,9}

}
