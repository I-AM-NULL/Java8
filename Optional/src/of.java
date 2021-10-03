import java.util.Optional;

public class of {
	
	public static void main(String[] args) {
		
		Optional<String> s = Optional.of("sai");
		System.out.println(s);
		System.out.println(s.get());
		
		String s2 = Optional.of("sai");//Type mismatch: cannot convert from Optional<String> to String
		System.out.println(s2);
		System.out.println(s2.get());
		
		
		
		Optional<String> s3 = Optional.of(null);
		System.out.println(s3);//java.lang.NullPointerException
		System.out.println(s3.get());
		
 	}

}
