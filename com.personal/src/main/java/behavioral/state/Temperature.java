package behavioral.state;

import behavioral.state.bean.*;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-19 08:29:15
 * @author: wanglong16@meicai.cn
 */
public class Temperature {

    private double temperature = 0;

    private TemperatureState state;

    public void springComing() {
        temperature = 10.1;
        state = new Warm();
    }

    public void summerComing() {
        temperature = 27.1;
        state = new Hot();
    }

    public void winterComing() {
        temperature = - 16.9;
        state = new Cold();
    }

    public void autumnComing() {
        temperature = 10.1;
        state = new Cool();
    }

    public void handleState() {
        System.out.println("----- 现在平均气温 ：" + temperature);
        state.sendTState();
    }
}
