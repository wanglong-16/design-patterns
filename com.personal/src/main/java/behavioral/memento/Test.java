package behavioral.memento;

import behavioral.memento.bean.Boss;
import behavioral.memento.bean.GamePlayer;
import behavioral.memento.bean.GamePlayerSnapshot;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-14 07:56:27
 * @author: wanglong16@meicai.cn
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss(4,20);
        GamePlayer gamePlayer = new GamePlayer();
        //打怪前快照
        GamePlayerSnapshot gamePlayerSnapshot = new GamePlayerSnapshot();
        gamePlayerSnapshot.snapshot(gamePlayer);
        System.out.println(gamePlayer.toString());
        //打怪
        gamePlayer.fightBoss(boss);
        System.out.println(gamePlayer.toString());
        //恢复
        gamePlayer = gamePlayerSnapshot.rollBack();
        System.out.println(gamePlayer.toString());
    }
}
