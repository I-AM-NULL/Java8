import java.util.Optional;

public class orElse {

	public static void main(String[] args) {
		
	String s1 = Optional.of("sai").orElseGet(()->"teja");
	Optional<String> s2 = Optional.empty();
	
	
	String s3 = s2.orElse("teja");// non-functional
	String s4 = s2.orElseGet(()->"teja");// functional 
	
	System.out.println(s1);
	System.out.println(s3);
	System.out.println(s4);
	}
}
