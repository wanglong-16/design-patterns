package creational.singleton;

import creational.singleton.impl.HungrySingleton;
import creational.singleton.impl.LazySingleton;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-14 08:19:26
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class Main {

    public static void main(String[] args) {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        hungrySingleton.printOut();

        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.printOut();
    }
}
