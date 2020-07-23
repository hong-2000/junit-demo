
public class e_条件测试 {
    /**
     * JUnit 中的条件测试也可以控制测试用例的执行，其中主要有以下几种条件。
     * 
     * 操作系统条件
     * 
     * 通过 @EnabledOnOs 和 @DisabledOnOs 注解来在指定的操作系统上运行或者关闭测试，这两个注解常用的参数有
     * LINUX、WINDOWS 、 MAC 和 OTHER 等表示操作系统的常量。
     * 
     * Java 运行环境条件
     * 
     * 通过 @EnabledOnJre 和 @DisabledOnJre 注解 ava 在指定的 Java 环境 (JRE)
     * 下运行或者关闭测试，这两个注解常用的参数有 JAVA_8、JAVA_9、JAVA_10 和 OTHER 等表示不同版本 JRE 的常量。
     * 
     * 系统属性条件
     * 
     * 根据 JVM 系统属性来开启或者关闭测试，通过 @EnabledIfSystemProperty 和 @DisabledIfSystemProperty
     * 注解来实现。这两个注解都拥有 named 和 matches 两个参数。named 为 JVM 系统参数名称，matches
     * 接受一个正则表达式，用于匹配指定参数的值。
     * 
     * 环境变量条件
     * 
     * 根据系统环境变量来开启或者关闭测试，通 @EnabledIfEnvironmentVariable
     * 和 @DisabledIfEnvironmentVariable 注解来实现，都拥有 named 和 matches 两个参数。named
     * 为环境变量参数名称，matches 接受一个正则表达式，用于匹配指定参数的值。
     */
}
