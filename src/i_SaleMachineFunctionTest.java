import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.Test;

public class i_SaleMachineFunctionTest {
    private i_SaleMachine saleMachine;

    @Before
    public void setUp() throws Exception {
        saleMachine = new i_SaleMachine(5, 5, 5);
    }

    @Test
    public void testOperation1() {
        saleMachine.operation("5J");
        String expectedResult = "Current State\n" + "Beer: 4\n" + "5 Jiao: 6\n" + "1 Yuan: 5";
        assertEquals(expectedResult, saleMachine.currentState());
    }

    @Test
    public void testOperation2() {
        saleMachine.operation("1Y");
        String expectedResult = "Current State\n" + "Beer: 4\n" + "5 Jiao: 4\n" + "1 Yuan: 6";
        assertEquals(expectedResult, saleMachine.currentState());
    }

    @Test
    public void testOperation3() {
        saleMachine.operation("1J");
        String expectedResult = "Current State\n" + "Beer: 5\n" + "5 Jiao: 5\n" + "1 Yuan: 5";
        assertEquals(expectedResult, saleMachine.currentState());
    }

    @Test
    public void testOperation4() {
        saleMachine.operation(null);
        String expectedResult = "Current State\n" + "Beer: 5\n" + "5 Jiao: 5\n" + "1 Yuan: 5";
        assertEquals(expectedResult, saleMachine.currentState());
    }
}