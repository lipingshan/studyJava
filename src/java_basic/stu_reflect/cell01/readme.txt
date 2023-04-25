java反射的应用，设计模式-->工厂模式
参考文档
https://www.cnblogs.com/zywds/p/9370107.html



//1.java获取当前程序（或类文件）所在目录
//http://www.blogjava.net/yydy1983/archive/2015/01/06/422074.html
 1、使用File类提供的方法来获取当前路径
 2、使用Class类的getResource("").getPath()获取当前.class文件所在的路径
 3、由System.getProperty("user.dir")获取当前程序的根目录    