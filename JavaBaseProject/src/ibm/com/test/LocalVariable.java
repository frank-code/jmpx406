package ibm.com.test;

public class LocalVariable {
	public void cattleAge(){
	      int age = 0;
	      age = age + 7;
	      System.out.println("Сţ��������: " + age);
	   }   
	   public static void main(String[] args){
	      LocalVariable test = new LocalVariable();
	      test.cattleAge();
	   }
}
