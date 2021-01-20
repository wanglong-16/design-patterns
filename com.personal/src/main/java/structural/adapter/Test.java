package structural.adapter;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-20 20:57:31
 * @author: wanglong16@meicai.cn
 */
public class Test {

    public static void main(String[] args) {
        UsbLine usbLine = new UsbLine();
        System.out.println("家庭电压" + usbLine.getHomeVolt());
        System.out.println("转换后的电压" + usbLine.convert());
    }
}
