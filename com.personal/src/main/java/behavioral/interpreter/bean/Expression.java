package behavioral.interpreter.bean;

/**
 * @description: 表达式，数字和计算规则
 * @version: 1.0
 * @date: 2021-01-16 11:41:17
 * @author: wanglong16@meicai.cn
 */
public interface Expression {
    /**
     * 数字返回值，表达式返回计算结果。
     * @return
     */
    int interpret();
}
