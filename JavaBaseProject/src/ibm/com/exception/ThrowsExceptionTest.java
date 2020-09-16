package ibm.com.exception;
public class ThrowsExceptionTest {
   public void test() throws RuntimeException{
     throw new RuntimeException();
   }	     
   public static void main(String[] args) {
	   new ThrowsExceptionTest().test();
   }
}
