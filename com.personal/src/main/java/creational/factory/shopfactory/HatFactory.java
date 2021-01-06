package creational.factory.shopfactory;

import creational.factory.bean.AbstractShopItem;
import creational.factory.bean.Hat;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-06 08:19:57
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class HatFactory implements IShopFactory {
    public AbstractShopItem create() {
        return new Hat("🎩", 33.5);
    }
}
