package ibm.com.exception;

public class ShowNum {
	public void show(int num) throws MyException {
		if(num < 0) {
			MyException me = new MyException("�쳣��" + num + "��������");
			throw(me);//�׳��쳣����������show()��ִ��
		}
		System.out.println(num);
	}
}
