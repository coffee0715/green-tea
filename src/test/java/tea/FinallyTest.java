package tea;

public class FinallyTest {

	public static void main(String[] args) {
		System.out.println(FinallyTest.test());
	}
	
	
	static int test() {
		int x = 1;
		try {
			return x;
		} finally {
			++x;
		}
	}
}
