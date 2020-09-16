package ibm.com.thread;

import java.util.concurrent.TimeUnit;

public class VolatileTest {
	int x = 0;//此处可以将volatile去除 或者 替换为 static，经过对比可看出volatile的作用
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
        TimeUnit.SECONDS.sleep(5);//记住此处一定要暂停5秒，以保证writeThread一定会在readThread中执行
        System.out.println("------");
        writeThread.start();        
    }	   
}
