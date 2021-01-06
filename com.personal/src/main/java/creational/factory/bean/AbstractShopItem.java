package creational.factory.bean;

/**
 * @description: 商品
 * @version: 1.0
 * @date: 2021-01-06 08:05:50
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public abstract class AbstractShopItem implements IShop {

    protected String name;

    protected Double price;

    public AbstractShopItem(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String description() {
        return String.format("商品: %s, 价格：%s", name, price);
    }
}
