package creational.singleton.impl;

/**
 * @description: 懒汉式单例模式，懒加载，先声明实例，等到使用时才初始化实例。
 * @version: 1.0
 * @date: 2021-01-14 08:11:14
 * @author: wanglong16@meicai.cn
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void printOut() {
        System.out.println("LazySingleton！！！");
    }

}
