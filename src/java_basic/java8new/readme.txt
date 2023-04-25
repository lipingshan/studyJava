
1.JAVA8十大新特性详解（精编）
https://www.jianshu.com/p/0bf8fe0f153b
2.探索Java8：(二)Function接口的使用
https://www.cnblogs.com/rever/p/9725173.html
3. :: 引用
https://ifeve.com/java-8-features-tutorial/
4. JAVA8 Supplier接口
https://blog.csdn.net/qq_28410283/article/details/80625482
5.stream
https://www.jianshu.com/p/0bb4daf6c800?from=groupmessage
https://www.jianshu.com/p/e429c517e9cb
https://www.runoob.com/java/java8-streams.html

6.Predicate接口的使用
https://www.cnblogs.com/rever/p/9773743.html
摘要
函数式接口
Lambda表达式是如何在java的类型系统中表示的呢？每一个lambda表达式都对应一个类型，通常是接口类型。而“函数式接口”是指仅仅只包含一个抽象方法的接口，每一个该类型的lambda表达式都会被匹配到这个抽象方法。
因为 默认方法 不算抽象方法，所以你也可以给你的函数式接口添加默认方法。
我们可以将lambda表达式当作任意只包含一个抽象方法的接口类型，
确保你的接口一定达到这个要求，你只需要给你的接口添加 @FunctionalInterface 注解，
编译器如果发现你标注了这个注解的接口有多于一个抽象方法的时候会报错的。
