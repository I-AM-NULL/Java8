import java.util.Optional;

public class ofNullable {
	public static void main(String[] args) {
		
		Optional<String> snn = Optional.ofNullable("sai");
		System.out.println(snn);
		System.out.println(snn.get());
		
		Optional<String> sn = Optional.ofNullable(null);
		System.out.println(sn);// Optional.empty
		System.out.println(sn.get());// java.util.NoSuchElementException:
		
		
	}

}
