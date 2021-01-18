package behavioral.visitor;

import behavioral.visitor.customer.DuFu;
import behavioral.visitor.customer.LiBai;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-15 08:41:55
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class Test {

    public static void main(String[] args) {
        FruitShop fruitShop = new FruitShop();
        IVisitor liBai = new LiBai();
        IVisitor duFu = new DuFu();
        fruitShop.prepareFruits();
        fruitShop.welcome(liBai);
        fruitShop.welcomeV2(duFu);
    }
}
