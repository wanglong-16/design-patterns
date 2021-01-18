package behavioral.visitor.bean;

import behavioral.visitor.IVisitor;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-15 08:43:56
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public abstract class Fruit {
    public abstract String name();

    public abstract void accept(IVisitor visitor);
}
