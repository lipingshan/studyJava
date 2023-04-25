package javaTool.cell001;

import lombok.Data;

@Data
public class MultiObject<T> {

    /**
     * 成功状态
     */
    private boolean success;

    /**
     * 异常
     */
    private Exception ex;

    /**
     * 数据
     */
    private T obj;


    public  T  getObj(){
        return  obj;
    }
    public MultiObject() {
    }

    /**
     * 注意：当传入的泛型是Boolean时，就和第三个构造函数冲突了。
     */
    public MultiObject(boolean success) {
        this.success = success;
    }

    public MultiObject(Exception ex) {
        this.success = false;
        this.ex = ex;
    }

    public MultiObject(T value) {
        this.success = true;
        this.obj = value;

    }
}
