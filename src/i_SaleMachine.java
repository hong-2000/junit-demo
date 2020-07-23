
public class i_SaleMachine {
    private int countOfBeer, countOfFiveJiao, countOfOneYuan;// 售货机中4个资源变量，分别代表啤酒的数量、橙汁的数量、5角硬币的数量、1元硬币的数量
    private String resultOfDeal;// 销售结果

    public i_SaleMachine()// 默认构造函数
    {
        initial();// 初始化
    }

    public void initial()// 将各类资源的数量清0
    {
        countOfBeer = 0; // 售货机啤酒数量清零
        countOfFiveJiao = 0;// 售货机5角硬币数量清零
        countOfOneYuan = 0;// 售货机1元硬币数量清零
    }

    public i_SaleMachine(int fiveJiao, int oneYuan, int numOfBeer)
    // 有参数的构造函数，将实际参数传递给形参，对类中属性变量初始化
    {
        countOfFiveJiao = fiveJiao;
        countOfOneYuan = oneYuan;
        countOfBeer = numOfBeer;
    }

    public String currentState()// 获取售货机当前四种资源变量数量值
    {
        String state = "Current State\n" + "Beer: " + countOfBeer + "\n" + "5 Jiao: " + countOfFiveJiao + "\n"
                + "1 Yuan: " + countOfOneYuan;
        return state;
    }

    public String operation(String money)// 售货机操作控制程序
    // type参数代表客户选择的购买商品类型，money参数代表客户投币类型
    {
        if (money.equalsIgnoreCase("5J")) // 如果客户投入5角钱
        {
            if (countOfBeer > 0) // 如果还有啤酒，进行交易，修改资源数量
            {
                // 路径S1输出信息
                countOfBeer--;
                countOfFiveJiao++;
                resultOfDeal = "Input Information\n" + "Money: 5 Jiao; Change: 0";
                return resultOfDeal;
            } else // 没有啤酒，输出啤酒短缺的信息
            {
                // 路径S2输出信息
                resultOfDeal = "Failure Information\n" + "Beer Shortage";
                return resultOfDeal;
            }
        } else if (money.equalsIgnoreCase("1Y")) // 如果客户投入一元钱
        {
            if (countOfFiveJiao > 0) // 如果售货机有5角零钱
            {
                // 路径S3输出信息，还有啤酒
                if (countOfBeer >= 0) {
                    countOfBeer--;
                    countOfFiveJiao++;
                    countOfOneYuan++;
                    resultOfDeal = "Input Information\n" + "Money: 1 Yuan; Change: 5 Jiao";
                    return resultOfDeal;
                } else {
                    // 路径S4，没有啤酒，输出啤酒短缺信息
                    resultOfDeal = "Failure Information\n" + "Beer Shortage";
                    return resultOfDeal;
                }
            } else // 售货机没有5角零钱，输出零钱短缺错误信息
            {
                // 路径S5输出信息
                resultOfDeal = "Failure Information\n" + "Change Shortage";
                return resultOfDeal;
            }
        } else // 客户输入不是5J和1Y,输出投币类型错误信息
        {
            // 路径S6输出信息
            resultOfDeal = "Failure Information\n" + "Money Error";
            return resultOfDeal;
        }
    }
}
