
静态代理
参考文档
https://blog.csdn.net/zpf336/article/details/82751925
1.生成代理类，
2代理关系与委托关系在运行前确定
由程序员创建或工具生成代理类的源码，再编译代理类。
所谓静态也就是在程序运行前就已经存在代理类的字节码文件，
代理类和委托类的关系在运行前就确定了
2.静态代理类优缺点
优点：
业务类只需要关注业务逻辑本身，保证了业务类的重用性。这是代理的共有优点。
缺点：
代理对象的一个接口只服务于一种类型的对象，如果要代理的方法很多，势必要为每一种方法都进行代理，静态代理在程序规模稍大时就无法胜任了。
如果接口增加一个方法，除了所有实现类需要实现这个方法外，所有代理类也需要实现此方法。增加了代码维护的复杂度。
3.稍加改进
  如果代理的操作不是针对委托者有的的功能（方法）那么仅仅需要继承实现类，不去实现接口了。
  参考文档：https://www.jianshu.com/p/75da4a108126

