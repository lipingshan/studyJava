适配器模式
adapter
参考文档：http://c.biancheng.net/view/1361.html
适配器模式（Adapter）的定义如下：
    将一个类的接口转换成客户希望的另外一个接口，
    使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
    适配器模式分为类结构型模式和对象结构型模式两种，前者类之间的耦合度比后者高，
    且要求程序员了解现有组件库中的相关组件的内部结构，所以应用相对较少些。
适配器模式 组成：
    现成组件Subject,里面有些可以直接使用的功能(方法)；
    通过适配器模式改造后的 组件AdapterSubject ,
    目标接口Target,
    现在要使得 AdapterSubject的对像 adapterSubject instance of Target 的结果为true,
    比如有个这种场合：调用方法 public void method(Target ta){};
    其中 Target ta = new AdapterSubject()。

适配器模式分为类结构型模式和对象结构型模式两种。
    类结构型模式，AdapterSubject通过继承Subject并且实现接口Target完成。
    对象结构型模式，AdapterSubject通过实现接口Target，和聚合引用private Subject；完成。
