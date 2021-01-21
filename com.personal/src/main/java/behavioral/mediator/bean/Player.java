package behavioral.mediator.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-21 08:19:49
 * @author: wanglong16@meicai.cn
 */
public class Player implements PayOrReceive{

    private final WeiXinGroup weiXinGroup;

    private int money = 100;

    private String name;

    public Player(WeiXinGroup weiXinGroup) {
        this.weiXinGroup = weiXinGroup;
    }

    public Player(WeiXinGroup weiXinGroup, int money) {
        this.weiXinGroup = weiXinGroup;
        this.money = money;
    }

    public Player(WeiXinGroup weiXinGroup, int money, String name) {
        this.weiXinGroup = weiXinGroup;
        this.money = money;
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public void pay(WeiXinGroup group, int money) {
        synchronized (weiXinGroup) {
            int wxMoney = weiXinGroup.getMoney();
            weiXinGroup.setMoney(wxMoney + money);
            this.money -= money;
            weiXinGroup.notifyAll();
        }
        System.out.println(name + "还剩: " + this.money);
        System.out.println("微信群还剩：" + weiXinGroup.getMoney());
    }

    @Override
    public void receive(WeiXinGroup group, int money) {
        synchronized (weiXinGroup) {
            int wxMoney = weiXinGroup.getMoney();
            if (wxMoney - money < 0) {
                try {
                    weiXinGroup.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                weiXinGroup.setMoney(wxMoney - money);
                this.money += money;
            }
        }
        System.out.println(name + "还剩: " + this.money);
        System.out.println("微信群还剩：" + weiXinGroup.getMoney());
    }
}
