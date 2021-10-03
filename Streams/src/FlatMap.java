import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
	
	public static void main(String[] args) {
		Employee e1 = new Employee("1","ABC");
		Employee e2 = new Employee("2","DEF");
		Employee e3 = new Employee("3","GHI");
		Employee e4 = new Employee("4","JKL");
		
		
		
		List<Employee> dev1 = new ArrayList<>();
		dev1.add(e4);
		dev1.add(e3);
		
		List<Employee> QA1 = new ArrayList<>();
		QA1.add(e2);
		QA1.add(e1);
		
		
		List<List<Employee>> mnc = new ArrayList<>();
		mnc.add(dev1);
		mnc.add(QA1);
		
		List<Employee> lmnc= mnc.stream().flatMap(s->s.stream()).collect(Collectors.toList());
		System.out.println(mnc);
		System.out.println(lmnc);
		
			
	}

}
