import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class  e_Condition {

    @Test
    @EnabledOnJre(JRE.JAVA_8) // java8环境下运行
    void javaRuntimeConditions() {
        System.out.println("JAVA 8");

    }

    @Test
    @DisabledOnJre(JRE.JAVA_8) // 除了java8其他的环境都会运行
    void notONJava8() {
        // 这段代码将不会运行在java8中
        System.out.println("It will not run on Java8.");

    }

    @Test
    @EnabledOnOs(OS.LINUX) // Linux系统下运行
    void operatingSystemConditions() {
        System.out.println("Running under Linux");
    }

    @Test
    @EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
    void systemPropertyConditions() {
        // 在64位虚拟机下运行
        System.out.println("Running on a 64 bit system");
        // 输出JVM参数列表
        System.out.println(System.getProperties());

    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "shiyanlou")
    void environmentVariableConditions() {
        // 输出环境变量参数列表
        System.out.println(System.getenv());
    }
}
