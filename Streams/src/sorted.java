import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorted extends Object {

	public static void main(String[] args) {
		

//		List<Integer>  lt  = new ArrayList<>();
//		
//		lt.add(1);
//		lt.add(2);
//		lt.add(3);
//		lt.add(6);
//		lt.add(5);
//		lt.add(4);
//		lt.add(7);
//		lt.add(8);
//		
////		lt.stream().sorted().toList().forEach(s->System.out.println(s));//natural order
//		lt.stream().sorted(Collections.reverseOrder()).toList().forEach(s->System.out.println(s));
		
		Employee e1 = new Employee("1","sai");
		Employee e2 = new Employee("2","teja");
		Employee e3 = new Employee("3","reddy");
		Employee e4 = new Employee("4","mamidi");
		List<Employee> le = new ArrayList<>();
		le.add(e4);
		le.add(e3);
		le.add(e2);
		le.add(e1);
		
		
//		le.stream().sorted(Collections.reverseOrder()).forEach(s->System.out.println(s.id + " "+s.name));
		le.stream().sorted((s1,s2)->s1.getId().compareTo(s2.getId())).forEach(s->System.out.println(s.id + " "+s.name)); 


	}

}
