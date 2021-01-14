package behavioral.memento.bean;

import behavioral.memento.bean.Boss;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-14 07:50:45
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class GamePlayer {

    private int life = 100;

    private int energy = 100;

    public GamePlayer() {
    }

    public GamePlayer(int life, int energy) {
        this.life = life;
        this.energy = energy;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void fightBoss(Boss boss) {
        if (this.life < boss.getHardLevel() * boss.getLife()) {
            this.life = 0;
            this.energy = 0;
        } else {
            this.life -= boss.getHardLevel() * boss.getLife();
            this.energy -= boss.getHardLevel() * boss.getLife();
        }
    }

    @Override
    public String toString() {
        return "GamePlayer{" +
                "life=" + life +
                ", energy=" + energy +
                '}';
    }
}
