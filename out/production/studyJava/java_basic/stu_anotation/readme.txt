自定义注解
参考文档
https://blog.csdn.net/xsp_happyboy/article/details/80987484

java中有四种元注解：@Retention、@Inherited、@Documented、@Target

@Retention
注解的保留位置（枚举RetentionPolicy），RetentionPolicy可选值：

    SOURCE：注解仅存在于源码中，在class字节码文件中不包含
    CLASS：默认的保留策略，注解在class字节码文件中存在，但运行时无法获得
    RUNTIME：注解在class字节码文件中存在，在运行时可以通过反射获取到
@Inherited
声明子类可以继承此注解，如果一个类A使用此注解，则类A的子类也继承此注解
@Inherited注解，是指定某个自定义注解如果写在了父类的声明部分，那么子类的声明部分也能自动拥有该注解。@Inherited注解只对那些@Target被定义为ElementType.TYPE的自定义注解起作用。

@Documented
声明注解能够被javadoc等识别（下面自定义注解处会有例子做介绍，点击查看）

@Target
用来声明注解范围（枚举ElementType），ElementType可选值：

TYPE：接口、类、枚举、注解
FIELD：字段、枚举的常量
METHOD：方法
PARAMETER：方法参数
CONSTRUCTOR：构造函数
LOCAL_VARIABLE：局部变量
ANNOTATION_TYPE：注解
PACKAGE：包