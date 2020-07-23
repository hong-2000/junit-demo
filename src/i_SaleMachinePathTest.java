import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class i_SaleMachinePathTest {

    @Test
    public void testOperationS1() { // 路径S1：有零钱 有啤酒 投5角
        i_SaleMachine saleMachine1 = new i_SaleMachine(5, 5, 5);
        String expectedResult = "Input Information\n" + "Money: 5 Jiao; Change: 0";
        assertEquals(expectedResult, saleMachine1.operation("5J"));
    }

    @Test
    public void testOperationS2() { // 路径S2：有零钱 无啤酒 投5角
        i_SaleMachine saleMachine2 = new i_SaleMachine(5, 5, 0);
        String expectedResult = "Failure Information\n" + "Beer Shortage";
        assertEquals(expectedResult, saleMachine2.operation("5J"));
    }

    @Test
    public void testOperationS3() { // 路径S3：有零钱 有啤酒 投1元
        i_SaleMachine saleMachine3 = new i_SaleMachine(5, 5, 5);
        String expectedResult = "Input Information\n" + "Money: 1 Yuan; Change: 5 Jiao";
        assertEquals(expectedResult, saleMachine3.operation("1Y"));
    }

    @Test
    public void testOperationS4() { // 路径S4：有零钱 无啤酒 投1元
        i_SaleMachine saleMachine4 = new i_SaleMachine(5, 5, 0);
        String expectedResult = "Failure Information\n" + "Beer Shortage";
        assertEquals(expectedResult, saleMachine4.operation("1Y"));
    }

    @Test
    public void testOperationS5() { // 路径S5：无零钱 有啤酒 投1元
        i_SaleMachine saleMachine5 = new i_SaleMachine(0, 5, 5);
        String expectedResult = "Failure Information\n" + "Change Shortage";
        assertEquals(expectedResult, saleMachine5.operation("1Y"));
    }

    @Test
    public void testOperationS6() { // 路径S6：有零钱 有啤酒 投1角
        i_SaleMachine saleMachine6 = new i_SaleMachine(5, 5, 5);
        String expectedResult = "Failure Information\n" + "Money Error";
        assertEquals(expectedResult, saleMachine6.operation("1J"));
    }
}