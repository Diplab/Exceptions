public class ModAssertionExample {

	public static void main(String[] args) {
		System.out.println((-1) % 3);
		int i = -1;
		if (i % 3 == 0) {

		} else if (i % 3 == 1) {

		} else {
			assert i % 3 == 2 : i;
		}
	}

}
