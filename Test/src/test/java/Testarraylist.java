import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Testarraylist {

	public static void main(String[] args) {
		Map<Integer , String> al = new LinkedHashMap<Integer, String>();
		al.put(1 ,"ravi");
		al.put(2 ,"kiran");
		al.put(1 ,"sandeep");
		al.put(6 ,"pallavi");
		al.put(4 ,"sandeep");
		al.put(6 ,"sandeep");
		al.put(12 , "kir");
		al.put(9 , "raaaa");
		al.remove(9);
		//ssh key
	//	System.out.println(al);
		//al.remove("sandeep");
	//	System.out.println(al);
	//	al.remove(5);
		//al.add(12.6);
		System.out.println(al);

	}

}
