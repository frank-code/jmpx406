public class StringBufferDemo{
  public static void main(String args[]){
    StringBuffer sBuffer = new StringBuffer("百度官网：");
    sBuffer.append("www");
    sBuffer.append(".baidu");
    sBuffer.append(".com");
    System.out.println(sBuffer);  
  }
}