package java_basic.stu_anotation.cell01;
@ClassAnnotation(name="类注解",num=99,hobby={"animal","book","tree"})
public class Student {
    @FieldAnnotation(description = "体重(kg)",length =70 )
    private int weight;
    @FieldAnnotation(description = "身高(cm)",length =174 )
    private int height ;

    @CherryAnnotation(name="夏明",score={20,30,40,50})
    @ParameterAnnotation(name="方法和参数->方法")
    public void study(@ParameterAnnotation(name="方法和参数->参数") String message){
        System.out.println("study--->"+message);
    }
}
