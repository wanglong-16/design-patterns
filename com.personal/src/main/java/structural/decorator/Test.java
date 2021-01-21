package structural.decorator;

import structural.decorator.bean.BFSwordDecorator;
import structural.decorator.bean.HeiQieDecorator;
import structural.decorator.bean.Player;
import structural.decorator.bean.PlayerV2;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-21 07:59:25
 * @author: wanglong16@meicai.cn
 */
public class Test {

    public static void main(String[] args) {
        Player player = new Player();
        System.out.println("playerV2 初始攻击力" + player.getPower());
        BFSwordDecorator swordDecorator = new BFSwordDecorator(player);
        System.out.println("购买了暴风大剑" + swordDecorator.getPower());

        PlayerV2 playerV2 = new PlayerV2();
        System.out.println("playerV2 初始生命值为" + playerV2.getLife() + "攻击力" + playerV2.getPower());
        HeiQieDecorator heiQieDecorator = new HeiQieDecorator(playerV2);
        System.out.println("playerV2 初始生命值为" + heiQieDecorator.getLife() + "攻击力" + heiQieDecorator.getPower());
    }
}
