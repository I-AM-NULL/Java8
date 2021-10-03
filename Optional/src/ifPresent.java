import java.util.Optional;

public class ifPresent {

	public static void main(String[] args) {
		String st  = "A";
		String st1  ="";
		Optional<String> st2 =Optional.of("ABC");
		Optional<String> st3 =Optional.empty();
		
	    Optional.of(st1).ifPresent(s->{System.out.println(s+"Hello1");});
		
	    Optional.of(st).ifPresent(s->{System.out.println(s);});
		
	    st2.ifPresent(s->{s.getClass(); System.out.println(s);});
	    st3.ifPresent(s->{s.getClass(); System.out.println(s+"Hello World");});

	}

}
 