package creational.factory;

import creational.factory.bean.AbstractShopItem;
import creational.factory.shopfactory.HatFactory;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-06 08:18:10
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class Test {

    public static void main(String[] args) {
        AbstractShopItem shoes = SimpleFactory.create("shoes");
        System.out.println(shoes.description());
        AbstractShopItem hat = new HatFactory().create();
        System.out.println(hat.description());
    }
}
