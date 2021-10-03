import java.util.Optional;

public class isPresent {
	public static void main(String[] args) {
		
		String st  = "A";
		String st1  ="";// this is considered as is present
		String st2  ;////The local variable st2 may not have been initialized
		Optional<String> st3 = Optional.empty();
	    Optional<String> st4 = Optional.of("");	
		
		
		boolean emp = Optional.of(st1).isPresent();
		
		boolean nnemp = Optional.of(st).isPresent();
		
//		boolean ud = Optional.of(st2).isPresent();//The local variable st2 may not have been initialized
		
		System.out.println(emp);// output : true
		System.out.println(nnemp);//output : true
		System.out.println(st3.isPresent());// output : false
		System.out.println(st4.isPresent());// output : true
		
	}

}
