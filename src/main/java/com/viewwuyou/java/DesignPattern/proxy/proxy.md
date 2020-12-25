# 设计模式——代理模式
代理，简而言之就是代替一个类进行一些操作，这个代替的过程我们常常用持有来表示。

也就是对于一个代理类来说，它往往是持有着被代理的对象的，这是很重要的一点。

同时，光光是持有还不够，代理更重要的是它的两个作用：

 - 保护被代理类
 - 增强被代理类

所谓保护，也就是在代理类持有了被代理类的对象后，可以有效的避免被代理类的直接访问

而增强，则是可以在代理类中增强相关被代理类的方法，也就是后面我们熟知的AOP的原理

## 静态代理模式
静态代理模式是手动静态实现代理类，如改包下`staticProxy`包中所展示的

是不利于拓展以及不符合软件设计原则的代理类，因此不怎么常用。