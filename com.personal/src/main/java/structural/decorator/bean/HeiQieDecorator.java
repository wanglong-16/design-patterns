package structural.decorator.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-21 08:05:08
 * @author: wanglong16@meicai.cn
 */
public class HeiQieDecorator implements ILife{

    private PlayerV2 playerV2;

    public HeiQieDecorator(PlayerV2 playerV2) {
        this.playerV2 = playerV2;
    }

    @Override
    public int getLife() {
        return playerV2.getLife() + 400;
    }

    @Override
    public int getPower() {
        return playerV2.getPower() + 35;
    }
}
