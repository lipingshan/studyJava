https://www.jianshu.com/p/3dd7b4e73561

为什么要在集合之外引入Iterator角色？

一个重要的理由：引入Iterator后可以将遍历与实现分离开来。

  while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
这里使用了Iterator的hasNext方法和next方法，并没有调用BookShelf的方法。也就是说，这里的while循环并不依赖于BookShelf的实现。

作者：嘟嘟碰碰叮叮当当
链接：https://www.jianshu.com/p/3dd7b4e73561
来源：简书
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。