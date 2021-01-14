package behavioral.memento.bean;

/**
 * @description: 备忘录模式的快照信息
 * @version: 1.0
 * @date: 2021-01-14 07:58:24
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class GamePlayerSnapshot {

    private int playerLife = 0;

    private int playerEnergy = 0;

    public GamePlayerSnapshot() {
    }

    public int getPlayerLife() {
        return playerLife;
    }

    public int getPlayerEnergy() {
        return playerEnergy;
    }

    public GamePlayerSnapshot snapshot(GamePlayer player) {
        this.playerLife = player.getLife();
        this.playerEnergy = player.getEnergy();
        return this;
    }

    public GamePlayer rollBack() {
        return new GamePlayer(this.playerLife, this.playerEnergy);
    }
}
