package behavioral.state.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-19 08:26:10
 * @author: wanglong16@meicai.cn
 */
public class Cool implements TemperatureState{
    @Override
    public void sendTState() {
        System.out.println("凉爽");
    }
}
