package behavioral.mediator.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-21 08:18:30
 * @author: wanglong16@meicai.cn
 */
public class WeiXinGroup {

    /**
     * 所有玩家剩余的钱
     */
    private int money;

    public WeiXinGroup(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
