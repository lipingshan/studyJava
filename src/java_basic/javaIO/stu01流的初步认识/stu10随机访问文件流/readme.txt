Java 实现文件随机读写-RandomAccessFile

public class RandomAccessFile implements DataOutput, DataInput, Closeable


可以用来做什么？
1.向大文件中追加数据 避免内存溢出
向5G数据的txt文本里追加了，结果XXX君傻了，他内存只有4G，如果强制读取所有的数据并追加，会报内存溢出的异常。
其实上面的需求很简单，如果我们使用JAVA IO体系中的RandomAccessFile类来完成的话，可以实现零内存追加。
其实这就是支持任意位置读写类的强大之处。
2.多线程下载
参考文档
https://blog.csdn.net/akon_vm/article/details/7429245
利用RandomAccessFile实现文件的多线程下载，即多线程下载一个文件时，将文件分成几块，每块用不同的线程进行下载。
下面是一个利用多线程在写文件时的例子，其中预先分配文件所需要的空间，然后在所分配的空间中进行分块，然后写入