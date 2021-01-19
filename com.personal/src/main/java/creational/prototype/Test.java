package creational.prototype;

import creational.prototype.bean.Tiger;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-19 21:01:42
 * @author: wanglong16@meicai.cn
 */
public class Test {

    public static void main(String[] args) {
        Tiger tiger = new Tiger("🐯 - tom");
        Tiger t1 = tiger.protoTypeClone();
        tiger.grow();
        System.out.println(tiger.toString());
        System.out.println(t1.toString());
    }
}
