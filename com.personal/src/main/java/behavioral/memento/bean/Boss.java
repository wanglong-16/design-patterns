package behavioral.memento.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-14 07:53:21
 * @author: wanglong16@meicai.cn
 */
public class Boss {

    private int hardLevel = 1;

    private int life = 10;

    public Boss(int hardLevel, int life) {
        this.hardLevel = hardLevel;
        this.life = life;
    }

    public int getHardLevel() {
        return hardLevel;
    }

    public void setHardLevel(int hardLevel) {
        this.hardLevel = hardLevel;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
