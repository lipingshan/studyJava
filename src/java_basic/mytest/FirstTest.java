package java_basic.mytest;

import org.junit.Test;

import java.util.regex.Pattern;

public class FirstTest {
    @Test
    public void method() {
        String str = "aab||as||ccd||";
        System.out.println(str.substring(0,(str.length()-"||".length())));
    }
    @Test
    public void method01() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc").append("||").append("a21").append("||");
        System.out.println(stringBuilder.toString());

    }
    @Test
    public void method1() {
        System.out.println( get18IDNo( "320311770706001", "2020-08-09"));;
    }
    public  String get15IDNo(String IDNo) {
        String str = "";
        str += IDNo.substring(0, 6);
        str += IDNo.substring(8, 17);
        return str;
    }

    public  String get18IDNo(String IDNo, String Birthday) {
        if (IDNo.length() == 18) {
            if (IDNo.endsWith("x"))
                IDNo = IDNo.substring(0, 17) + "X";
            return IDNo;
        }
        String str = "";
        str += IDNo.substring(0, 6);
        if (Birthday.length() == 10) {
            str += Birthday.substring(0, 2);
        } else
            str += "19";
        str += IDNo.substring(6, 15);
        int n = 0;
        int[] weight = new int[] { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5,
                8, 4, 2 };
        for (int i = 0; i < 17; i++) {
            n += Integer.parseInt(str.substring(i, i + 1)) * weight[i];
        }
        n %= 11;
        if (n == 0)
            str += "1";
        else if (n == 1)
            str += "0";
        else if (n == 2)
            str += "X";
        else if (n == 3)
            str += "9";
        else if (n == 4)
            str += "8";
        else if (n == 5)
            str += "7";
        else if (n == 6)
            str += "6";
        else if (n == 7)
            str += "5";
        else if (n == 8)
            str += "4";
        else if (n == 9)
            str += "3";
        else if (n == 10)
            str += "2";
        return str;
    }

    @Test
    public void method2() {
        //转为
        System.out.println(Integer.toBinaryString(256));
    }

    //将10进制转为2进制
//    String toBinaryStr(int num){
//        String step1 = Integer.toBinaryString(num);
//
//    }
    @Test
    public void method3() {
        String res = "aaa12312adfa".replaceAll("[^0-9]", "");
        System.out.println(res);
    }
    @Test
    public void method4() {
        //"2001-08-10"
        String content = "2020-09-22 10:09:57";
        String pattern = "^[1-9][0-9]{3}-[0-9]{2}-[0-9]{2}$";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println(isMatch);
    }

}
