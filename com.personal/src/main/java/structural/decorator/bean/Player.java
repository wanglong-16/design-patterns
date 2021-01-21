package structural.decorator.bean;

/**
 * @description: 实现接口来增强功能
 * @version: 1.0
 * @date: 2021-01-21 07:54:32
 * @author: wanglong16@meicai.cn
 */
public class Player implements IPower{

    private int power = 102;

    @Override
    public int getPower() {
        return power;
    }
}
