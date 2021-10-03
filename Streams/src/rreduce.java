import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class rreduce {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("1","sai");
		Employee e2 = new Employee("2","teja");
		Employee e3 = new Employee("3","reddy");
		Employee e4 = new Employee("4","mamidi");
		List<Employee> le = new ArrayList<>();
		le.add(e4);
		le.add(e3);
		le.add(e2);
		le.add(e1);
		
	String a = le.stream().map(s->s.getName()).reduce("",(s1,s2)->s1+s2);
	System.out.println(a);
		
	}

}
