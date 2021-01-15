package behavioral.visitor;

import behavioral.visitor.bean.Apple;
import behavioral.visitor.bean.Banana;
import behavioral.visitor.bean.Orange;

/**
 * @description: 访问者接口
 * @version: 1.0
 * @date: 2021-01-15 08:48:26
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public interface IVisitor {

    void chooseFruit(Banana banana);

    void chooseFruit(Apple apple);

    void chooseFruit(Orange orange);
}
