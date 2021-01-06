package creational.factory;

import creational.factory.bean.AbstractShopItem;
import creational.factory.bean.Coat;
import creational.factory.bean.Hat;
import creational.factory.bean.Shoes;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-06 08:18:33
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class SimpleFactory {

    public static AbstractShopItem create(String shop) {
        if ("shoes".equals(shop)) {
            return new Shoes("🥿", 99.0);
        } else if ("hat".equals(shop)) {
            return new Hat("🎩", 33.5);
        } else if ("coat".equals(shop)) {
            return new Coat("🧥", 100.0);
        } else {
            throw new IllegalArgumentException("未知商品");
        }
    }
}
