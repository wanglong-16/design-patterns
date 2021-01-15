package behavioral.visitor.bean;

import behavioral.visitor.IVisitor;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-15 08:44:37
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class Banana extends Fruit {
    @Override
    public String name() {
        return "🍌";
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.chooseFruit(this);
    }
}
