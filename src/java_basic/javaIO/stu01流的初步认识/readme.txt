设备上的数据无论是图片或者视频，文字，它们都以二进制存储的。
二进制的最终都是以一个8位为数据单元进行体现，所以计算机中的最小数据单元就是字节。
意味着，字节流可以处理设备上的所有数据，所以字节流一样可以处理字符数据。

结论：只要是处理纯文本数据，就优先考虑使用字符流。 除此之外都使用字节流。


java文件读写链接流向  大概方向
1)字节流 读写的链接流向
源节点->FileInputStream->BufferedInputStream->ObjectInputStream->程序

程序->ObjectOutputStream->BufferedOutputStream->FileOutputStream->目标节点


2)字符流 读写的链接流向
源节点->FileReader->BufferedReader->程序

程序->BufferedWriter->FileWriter->目标节点