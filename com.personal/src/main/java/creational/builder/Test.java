package creational.builder;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-06 22:01:29
 * @author: wanglong16@meicai.cn
 */
public class Test {

    public static void main(String[] args) {
        MilkTea milkTea = new MilkTea.Builder()
                .ice(false)
                .price(30.0)
                .size("中杯")
                .build();
        System.out.println(milkTea.toString());
    }
}
