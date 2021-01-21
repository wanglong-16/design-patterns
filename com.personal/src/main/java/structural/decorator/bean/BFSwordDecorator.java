package structural.decorator.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-21 07:57:14
 * @author: wanglong16@meicai.cn
 */
public class BFSwordDecorator implements IPower{

    Player player;

    public BFSwordDecorator(Player player) {
        this.player = player;
    }

    @Override
    public int getPower() {
        return player.getPower() + 40;
    }
}
