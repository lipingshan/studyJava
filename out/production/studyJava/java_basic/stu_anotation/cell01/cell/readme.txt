参考文档
https://www.jianshu.com/p/7f54e7250be3
前提条件是类注解，即 @Target(ElementType.Type)
1.
类继承关系中@Inherited的作用
类继承关系中，子类会继承父类使用的注解中被@Inherited修饰的注解
2.
接口继承关系中@Inherited的作用
接口继承关系中，子接口不会继承父接口中的任何注解，不管父接口中使用的注解有没有被@Inherited修饰
3.
类实现接口关系中@Inherited的作用
类实现接口时不会继承任何接口中定义的注解
