package creational.factory.shopfactory;

import creational.factory.bean.AbstractShopItem;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-06 08:27:40
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public interface IShopFactory {

    AbstractShopItem create();
}
