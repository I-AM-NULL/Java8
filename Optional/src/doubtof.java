import java.util.Optional;

public class doubtof {
	public static void main(String[] args) {
		
		Optional<String> s1 = Optional.of("A");
		System.out.println(s1);
		
		String s2 = Optional.of("A").orElseGet(()->"B");
		System.out.println(s2);
		
		String s3 = Optional.of("A");//Type mismatch: cannot convert from Optional<String> to String
	}
	

}
