package behavioral.state.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-19 08:27:08
 * @author: wanglong16@meicai.cn
 */
public class Hot implements TemperatureState{
    @Override
    public void sendTState() {
        System.out.println("炎热 🥵");
    }
}
