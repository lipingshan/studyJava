外观模式
参考文档
http://c.biancheng.net/view/1369.html
https://www.runoob.com/w3cnote/facade-pattern-3.html
软件设计也是这样，当一个系统的功能越来越强，子系统会越来越多，客户对系统的访问也变得越来越复杂。
这时如果系统内部发生改变，客户端也要跟着改变，这违背了“开闭原则”，也违背了“迪米特法则”，
所以有必要为多个子系统提供一个统一的接口，从而降低系统的耦合度，这就是外观模式的目标。

外观（Facade）模式的结构比较简单，主要是定义了一个高层接口。它包含了对各个子系统的引用，客户端可以通过它访问各个子系统的功能。现在来分析其基本结构和实现方法。
1. 模式的结构
外观（Facade）模式包含以下主要角色。
外观（Facade）角色：为多个子系统对外提供一个共同的接口。
子系统（SubSystem）角色：实现系统的部分功能，客户可以通过外观角色访问它。
客户（Client）角色：通过一个外观角色访问各个子系统的功能。

门面模式的优点
松散耦合: 门面模式松散了客户端与子系统的耦合关系，让子系统内部的模块能更容易扩展和维护。
简单易用: 门面模式让子系统更加易用，客户端不再需要了解子系统内部的实现，
也不需要跟众多子系统内部的模块进行交互，只需要跟门面类交互就可以了。

更好的划分访问层次: 通过合理使用Facade，可以帮助我们更好地划分访问的层次。
有些方法是对系统外的，有些方法是系统内部使用的。把需要暴露给外部的功能集中到门面中，
这样既方便客户端使用，也很好地隐藏了内部的细节。