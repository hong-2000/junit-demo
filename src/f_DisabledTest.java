import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class f_DisabledTest {

    @Test
    // 使用@Disabled注解关闭
    @Disabled
    void disabled() {
        System.out.println("Not running");
    }

    @Test
    void open() {
        System.out.println("running");
    }
}
