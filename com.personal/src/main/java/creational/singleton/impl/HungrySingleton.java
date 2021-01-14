package creational.singleton.impl;

/**
 * @description: 饿汉单例 单例一直存在
 * @version: 1.0
 * @date: 2021-01-14 08:12:41
 * @author: wanglong16@meicai.cn
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    public void printOut() {
        System.out.println("HungrySingleton！！！");
    }
}
