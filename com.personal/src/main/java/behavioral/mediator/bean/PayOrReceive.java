package behavioral.mediator.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-21 08:21:03
 * @author: wanglong16@meicai.cn
 */
public interface PayOrReceive {

    /**
     * 输钱需要付给微信群
     * @param group
     */
    void pay(WeiXinGroup group, int money);

    /**
     * 赢钱需要从微信群来拿钱
     * @param group
     */
    void receive(WeiXinGroup group, int money);

}
