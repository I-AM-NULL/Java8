import java.util.ArrayList;
import java.util.List;

public class Filters {
	
	
	public static void main(String[] args) {
		
		List<Integer>  lt  = new ArrayList<>();
		
		lt.add(1);
		lt.add(2);
		lt.add(3);
		lt.add(4);
		lt.add(5);
		lt.add(6);
		lt.add(7);
		lt.add(8);
		
		lt.stream().filter(s->s>5).toList().forEach(s->System.out.println(s));
		
		
	
	}

}
