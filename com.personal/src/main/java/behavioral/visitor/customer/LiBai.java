package behavioral.visitor.customer;

import behavioral.visitor.IVisitor;
import behavioral.visitor.bean.Apple;
import behavioral.visitor.bean.Banana;
import behavioral.visitor.bean.Orange;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-15 08:48:03
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class LiBai implements IVisitor {

    @Override
    public void chooseFruit(Banana banana) {
        System.out.println("我是诗仙 李白，我拿到了水果" + banana.name());
    }

    @Override
    public void chooseFruit(Apple apple) {
        System.out.println("我是诗仙 李白，我拿到了水果" + apple.name());
    }

    @Override
    public void chooseFruit(Orange orange) {
        System.out.println("我是诗仙 李白，我拿到了水果" + orange.name());
    }
}
