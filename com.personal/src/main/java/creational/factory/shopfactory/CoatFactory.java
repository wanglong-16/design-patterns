package creational.factory.shopfactory;

import creational.factory.bean.AbstractShopItem;
import creational.factory.bean.Coat;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-06 08:20:18
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class CoatFactory implements IShopFactory {

    public AbstractShopItem create() {
        return new Coat("🧥", 100.0);
    }
}
