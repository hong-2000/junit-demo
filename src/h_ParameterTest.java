import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

class h_ParameterTest {

    @ParameterizedTest
    @ValueSource(strings = { "Java", "C++", "Python" })
    void parameter(String args) {
        System.out.println(args);
    }

    @ParameterizedTest
    // 使用names制定需要的枚举常量
    @EnumSource(value = TimeUnit.class, names = { "DAYS", "HOURS" })
    void enumSource(TimeUnit timeUnit) {
        System.out.println(timeUnit.toString());
    }

    @ParameterizedTest
    @CsvSource({ "Java, 1", "C++, 2", "'Python, Lisp', 3" })
    void csvSource(String first, int second) {
        System.out.println(first + "---" + second);
    }

    @ParameterizedTest
    @ArgumentsSource(MyArgumentsProvider.class)
    void argumentsSource(String argument) {
        System.out.print(argument);
        ;
    }

    static class MyArgumentsProvider implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of("Java-", "C-", "Python\n").map(Arguments::of);
        }
    }
}
