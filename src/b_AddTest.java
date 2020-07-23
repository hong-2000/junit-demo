import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class b_AddTest {
    public static b_Add add;

    @BeforeAll //在所有测试方法运行前运行，并且只能修饰静态方法（除非修改测试实例生命周期）
    static void setUpBeforeClass() throws Exception {
        add = new b_Add();
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test  //表示这是个测试方法
    void add() {
        //断言相等，比较2和add.add(1,1)的返回值是否相等
        assertEquals(2,add.add(1,1));
    }

}
