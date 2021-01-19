package behavioral.state;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-19 08:37:14
 * @author: wanglong16@meicai.cn
 */
public class Test {

    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        temperature.autumnComing();
        temperature.handleState();

        temperature.winterComing();
        temperature.handleState();
    }
}
