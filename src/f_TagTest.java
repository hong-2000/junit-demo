import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class f_TagTest {

    @Test
    @Tag("tag1")
    void tag1() {
        System.out.println("Tag1 Test");
    }

    @Test
    @Tag("tag2")
    /**
     * 单击右键 -> run as -> run configurations。
     * 点击 configure。
     * 勾选 Include Tags 选项，在输入框中填入需要运行的测试方法的标签名。
     */
    void tag2() {
        System.out.println("Tag2 test");
    }

}