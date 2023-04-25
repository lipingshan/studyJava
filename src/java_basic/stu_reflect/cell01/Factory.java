package java_basic.stu_reflect.cell01;


class Factory{
    public static Fruit getInstance(String ClassName){

        Fruit f=null;
        try{
            f=(Fruit)Class.forName(ClassName).newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
