package ibm.com.exception;

public class MyExceptionTest {
	public static void main(String[] args) {

		ShowNum a = new ShowNum();
		int i = 1;
		try {
			int j = i / 0;
			a.show(-2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 

	}
}
