package java_basic.stu_binary;

public class Convert {
      /*
        计算机对有符号数（包括浮点数）的表示有三种方法：原码、反码和补码，补码=反码+1。
        在二进制里，是用0和1来表示正负的，最高位为符号位，最高位为1代表负数，最高位为0代表正数。
        以java中8位的byte为例，最大值为：0111 1111，最小值为1000 0000, 换算成十进制就是127和-128。
        那么根据十进制的数字，我们如何转换为二进制呢？对于正数我们直接转换即可，对于负数则有一个过程。
        以负数-5为例：
            1.先将-5的绝对值转换成二进制，即为0000 0101；
            2.然后求该二进制的反码，即为 1111 1010；
            3.最后将反码加1，即为：1111 1011
       **/
    //1.10进制转2进制
    public static void int2Binary(int i) {  
        // 整数长度  
        int intLen = 8;  
        String s = "";  
        boolean minus = (i < 0);  
        int length = 0;  
        //如果是负数，求其反码  
        if (minus)  
            i = -i;  
        while (i > 0) {  
            if (i % 2 != 0)  
                s = "1" + s;  
            else  
                s = "0" + s;  
            i /= 2;  
            length++;  
        }  
          
        if (minus)  
            for (i = 0; i < intLen - length; i++)  
                s = "1" + s;  
        System.out.println(s);  
    }  
  //2 10进制转为2进制
  public static String tenTotwo(int N) {
      String str = "";
      int x = N;
      int y = 0;
      while(x != 0){
          y = x % 2;
          x = x / 2;
          str = y + str;
      }
      return str;
  }
  //3 2进制转为10进制
    public static int twoToten(String two) {
        int n = 0;
        int j = 1;
        for(int i = two.length() - 1; i >= 0; i--){
            int x = two.charAt(i) - 48;
            n = n + x * j;
            j = j * 2;
        }
        return n;
    }

    public static void main(String[] args) {
        int a = 9;
//        int2Binary(-1);
        System.out.println(Integer.toBinaryString(a));
        int2Binary(a);
        System.out.println(tenTotwo(a));
        System.out.println(twoToten("1001"));
        System.out.println((int)'1');//49
        System.out.println((int)'0');
        System.out.println("***************************");
        System.out.println("2&7");
        System.out.println(Integer.toBinaryString(2)+"\n"+"+");
        System.out.println(Integer.toBinaryString(7));
        System.out.println(Integer.toBinaryString(2&7));

    }
}  