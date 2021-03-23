第一条:用静态工厂方法替代构造类
静态工厂方法与构造器不同的第一大优势在于，它们有名称。-effectiveJava.staticMethodReplaceConstructor.ownName
静态工厂方法与构造器不同的第二大优势在于，不必在每次调用它们的时候都创建一个新对象-effectiveJava.staticMethodReplaceConstructor.dontCreateNewObject
静态工厂方法与构造器不同的第三大优势在子，它们可以返回原返回类型的任何子类型的对象-effectiveJava.staticMethodReplaceConstructor.returnSubtypeObject
静态工厂的第四大优势在于，所返回的对象的类可以随着每次调用而发生变化，这取决于静态工厂方法的参数值-effectiveJava.staticMethodReplaceConstructor.returnByParamChange
静态工厂的第五大优势在于，方法返回的对象所属的类，在编写包含该静态工厂方法的类时可以不存在(服务提供者框架)-effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework

第2条：遇到多个构造器参数时要考虑使用构建器
重叠构造器模式-effectiveJava.manyConstructorUseStructure.telescopingConstructor
javaBeans模式-effectiveJava.manyConstructorUseStructure.javaBeansConstructor
建造者（Builder）模式-effectiveJava.manyConstructorUseStructure.builderMode

第3条：用私有构造器或者枚举类型强化Singleton属性
公有静态成员实现单例-effectiveJava.useConstructorOrEnumSingleton.field
公有景太方法实现单例-effectiveJava.useConstructorOrEnumSingleton.staticFactory
--可能存在的问题:通过反射或者序列化,造成创建对象不唯一
--反射:effectiveJava.useConstructorOrEnumSingleton.field.ReflectDemo
--序列化:effectiveJava.useConstructorOrEnumSingleton.field.SerializeDemo
---反射相关避免方法:effectiveJava.useConstructorOrEnumSingleton.staticFactory.ElvisExceptionDeal
---序列化相关避免方法:effectiveJava.useConstructorOrEnumSingleton.field.Elvis
枚举单例:effectiveJava.useConstructorOrEnumSingleton.enumType
使用枚举进行单例模式-cc.demo.enumSingleton.BankMessageHM

第4条：通过私有构造器强化不可实例化的能力
-effectiveJava.privateConstructorIntensify

第5条：优先考虑依赖注人来引用资源
-effectiveJava.dependencyInjection
一句话:本来我接受各种参数来构造一个对象，现在只接受一个参数——已经实例化的对象。
-三种注入方式-effectiveJava.dependencyInjection.threeMethod

第6条：避免创建不必要的对象
有些创建实例的成本很高,引入有限状态机(finite state machine)来重复使用相关对象-effectiveJava.avoidCreateObject.FiniteStateMachineDemo
要优先使用基类型而不是装箱基本类型，要当心无意识的自动装箱-effectiveJava.avoidCreateObject.autoBoxingDemo.Demo

第7条:消除过期的对象引用
只要类是自己管理内存，程序员就应该警惕内存泄漏问题-effectiveJava.clearExpiredObjectImport.StackDemo
内存泄漏的另一个常见来源是缓存-effectiveJava.clearExpiredObjectImport.cacheLeakage.CacheMapDemo
内存泄漏的第三个常见来源是监昕器和其他回调

第8条:避免使用终结方法和清除方法
GC存在风险,可能不在预定时间内执行,导致对象无法进行清理-effectiveJava.avoidUseFinalizerAndClear
原因:1>不能保证会被及时执行,根本就不保证它们会被执行(和不同的JVM有关)
原因:2>性能缺失,终结方法阻止了有效的垃圾回收,清除方法稍微快一点,try-with-resource,正常GC-12ns,cleaner-66ns,finalize-550ns
原因:3>安全问题,终结方法攻击(finalizer attack),
    解决方案:1>SensitiveOperation为final类
            2>SensitiveOperation.finalize()定义为final

第9条:try-with-resources优先于try-finally
-effectiveJava.tryWithResources
在处理必须关闭的资源时，始终要优先考虑用try-with-resources，面不是用 try-finally。这样得到的代码将更加简洁、清晰，产生的异常也更有价值。
有了 try-with-resources语句，在使用必须关闭的资源时，就能更轻松地正确编写代码了。实践证明这个用try-finally是不可能做到的。

第10条:覆盖equals时请遵守通用约定
类的每个实例本质上都是唯一的;-实例new 出的对象,都是唯一的,默认的equals比较实例对象,都是不相等的
类没有必要提供"逻辑相等"(logical equality)的测试功能
超类已经覆盖了equals,超类的行为对于这个类也是合适的
类是私有的,或者包级私有的,可以确定它的equals方法永远不会被调用-???什么玩意儿,没看懂,为什么?
equals等价关系,属性:自反性,对称性,传递性,一致性
自反性:x.equals(x)=true
对称性:x.equals(y)=true,必须,y.equals(a)=true
传递性:x.equals(y)=true,y.equals(z)=true,必须x.equals(z)=true
一致性:x,y没有被修改,多次调用x.equals(y)=true,必须一直成立
非空性:参数不能为null,否则,nullpointException