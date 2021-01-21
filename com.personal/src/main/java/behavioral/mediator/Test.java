package behavioral.mediator;

import behavioral.mediator.bean.Player;
import behavioral.mediator.bean.WeiXinGroup;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-21 08:31:20
 * @author: wanglong16@meicai.cn
 */
public class Test {

    public static void main(String[] args) {
        WeiXinGroup weiXinGroup = new WeiXinGroup(0);
        Player xiaoLi = new Player(weiXinGroup,400, "xiaoLi");
        Player xiaoMing = new Player(weiXinGroup,100, "xiaoMing");
        Player xiaoZhang = new Player(weiXinGroup,1000, "xiaoZhang");
        Player xiaoHong = new Player(weiXinGroup,900, "xiaoHong");
        new Thread(() -> xiaoHong.pay(weiXinGroup, 102)).start();
        new Thread(() -> xiaoZhang.pay(weiXinGroup,400)).start();
        new Thread(() -> xiaoLi.receive(weiXinGroup, 500)).start();
        new Thread(() -> xiaoMing.pay(weiXinGroup, 21)).start();
    }
}
