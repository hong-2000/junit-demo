import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

class g_Repeated {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before Each");
    }

    // 自定义重复测试的显示名称
    @RepeatedTest(value = 5, name = "{displayName}-->{currentRepetition}/{totalRepetitions}")
    @DisplayName("repeatTest")
    void repeatedTest(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        // 我们可以通过TestInfo在测试中获取测试的相关信息，比如输出自定义的测试名
        System.out.println(testInfo.getDisplayName());
        // 输出当前重复次数
        System.out.println("currentRepetition:" + repetitionInfo.getCurrentRepetition());

    }

    /**
     * 
     * 
     * 通过 @RepeatedTest 注解可以完成重复测试的工作，@RepeatedTest 中的 value 属性可以设置重复的次数，name
     * 属性可以自定义重复测试的显示名，显示名可以由占位符和静态文本组合，目前支持下面几种占位符：
     * 
     * {displayName}：显示名； {currentRepetition}：当前重复次数； {totalRepetitions}：总重复次数。
     * 
     * JUnit 重复测试提供了默认的显示名的模式：repetition {currentRepetition} of {totalRepetitions}。
     * 
     * 如果没有自定义的话，显示名就会是这种形式：repetition 1 of 10。
     * 
     * JUnit 还提供了另外一种显示名 RepeatedTest.LONG_DISPLAY_NAME，它显示的形式为：{displayName} ::
     * repetition {currentRepetition} of {totalRepetitions}，只需要将 @RepeatedTest(value
     * = 1, name = RepeatedTest.LONG_DISPLAY_NAME)
     * 注解到方法上就可以使用这种显示方式。如果想要用编程的方式获取当前循环测试的相关详细，可以将 RepetitionInfo 实例注入到相关的方法中。
     * 
     */
}
