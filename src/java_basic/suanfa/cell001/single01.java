package java_basic.suanfa.cell001;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.Arrays;

public class single01 {
    @Test
    public void method() {
        int [] A = {1,43,4,4,4,5,5,5};
        Arrays.sort(A);
        int [] src = new int[A.length];
        //复制原数组
        for(int i = 0;i<A.length;i++){
            src[i]=A[i];
        }
        System.out.println(JSON.toJSON(A));
      while(handle(A)){
            handle(A);
      }
        System.out.println(JSON.toJSON(A));
      int sum=0;
      for(int i = 0;i<src.length;i++){
         sum+= A[i]-src[i];
      }
        System.out.println("sum="+sum);
    }

    public boolean handle(int[] A){
        boolean flag =false;
        Arrays.sort(A);
        for(int i = 0;i<A.length;i++){
            if(i<=A.length-2&&A[i]==A[i+1]){
                A[i+1]+=1;
                flag=true;
            }
        }

        return flag;
    }
}

