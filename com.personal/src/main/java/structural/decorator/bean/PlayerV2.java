package structural.decorator.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-21 08:03:13
 * @author: wanglong16@meicai.cn
 */
public class PlayerV2 implements ILife {

    @Override
    public int getLife() {
        return 650;
    }

    @Override
    public int getPower() {
        return 102;
    }
}
