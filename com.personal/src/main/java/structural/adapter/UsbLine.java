package structural.adapter;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-20 20:58:02
 * @author: wanglong16@meicai.cn
 */
public class UsbLine {

    private int homeVolt = 220;

    public int getHomeVolt() {
        return homeVolt;
    }

    public int convert() {
        return homeVolt - 215;
    }

}
