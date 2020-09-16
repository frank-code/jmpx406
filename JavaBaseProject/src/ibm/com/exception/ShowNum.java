package ibm.com.exception;

public class ShowNum {
	public void show(int num) throws MyException {
		if(num < 0) {
			MyException me = new MyException("异常：" + num + "不是正数");
			throw(me);//抛出异常，结束方法show()的执行
		}
		System.out.println(num);
	}
}
