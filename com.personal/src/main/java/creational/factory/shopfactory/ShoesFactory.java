package creational.factory.shopfactory;

import creational.factory.bean.AbstractShopItem;
import creational.factory.bean.Shoes;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-06 08:19:36
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class ShoesFactory implements IShopFactory {
    public AbstractShopItem create() {
        return new Shoes("🥿", 99.0);
    }
}
