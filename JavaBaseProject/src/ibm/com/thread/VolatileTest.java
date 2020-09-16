package ibm.com.thread;

import java.util.concurrent.TimeUnit;

public class VolatileTest {
	int x = 0;//�˴����Խ�volatileȥ�� ���� �滻Ϊ static�������Աȿɿ���volatile������
    private void write() {
        x = 5;
    }
    private void read() {
        while (x != 5) {
        }
        if(x == 5){
            System.out.println("------stoped");
        }
    }
    public static void main(String[] args) throws Exception {
    	VolatileTest example = new VolatileTest();
        Thread writeThread = new Thread(new Runnable() {
            public void run() {
                example.write();
            }
        });
        Thread readThread = new Thread(new Runnable() {
            public void run() {
                example.read();
            }
        });
        readThread.start();
        TimeUnit.SECONDS.sleep(5);//��ס�˴�һ��Ҫ��ͣ5�룬�Ա�֤writeThreadһ������readThread��ִ��
        System.out.println("------");
        writeThread.start();        
    }	   
}
