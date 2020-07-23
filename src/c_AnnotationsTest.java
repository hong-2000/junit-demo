import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

//常用注解测试
@DisplayName("Common annotation test")
class c_AnnotationsTest {

    private static b_Add add;

    @BeforeAll
    public static void beforeAll() {
        add = new b_Add();
        // 在所有测试方法运行前运行
        System.out.println("Run before all test methods run");
    }

    @BeforeEach
    public void beforeEach() {
        // 每个测试方法运行前运行
        System.out.println("Run before each test method runs");
    }

    @AfterEach
    public void afterEach() {
        // 每个测试方法运行完毕后运行
        System.out.println("Run after each test method finishes running");
    }

    @AfterAll
    public static void afterAll() {
        // 在所有测试方法运行完毕后运行
        System.out.println("Run after all test methods have finished running");
    }

    @Disabled
    @Test
    @DisplayName("Ignore the test")
    public void disabledTest() {
        // 这个测试不会运行
        System.out.println("This test will not run");
    }

    @Test
    @DisplayName("Test Methods 1+1")
    public void testAdd1() {
        System.out.println("Running test method1+1");
        Assertions.assertEquals(2, add.add(1, 1));
    }

    @Test
    @DisplayName("Test Methods 2+2")
    @RepeatedTest(1)
    public void testAdd2() {
        // 这个测试将重复一次
        System.out.println("Running test method2+2");
        Assertions.assertEquals(4, add.add(2, 2));
    }

}