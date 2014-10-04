
public class DemoAssertionError {

	public static void main(String[] args) {
		//run with -ea option and get
		//Exception in thread "main" java.lang.AssertionError: HI
		//at DemoAssertionError.main(DemoAssertionError.java:5)
		assert false : "HI";
	}

}
