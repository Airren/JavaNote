# @Value() 取不到值



主要问题的原因就是，构造函数的执行顺序先于类属性的赋值。在构造函数中使用属性的值且从application.yml通过@Value获取，此时Spring容器还没有向属性赋值。这是Spring Bean的声明周期的属性造成的。

