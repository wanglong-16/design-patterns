package behavioral.visitor;

import behavioral.visitor.bean.Apple;
import behavioral.visitor.bean.Banana;
import behavioral.visitor.bean.Fruit;
import behavioral.visitor.bean.Orange;
import com.sun.tools.corba.se.idl.constExpr.Or;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-15 08:51:29
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class FruitShop {

    private List<Fruit> fruits = new ArrayList<Fruit>();

    public void prepareFruits() {
        fruits.add(new Banana());
        fruits.add(new Apple());
        fruits.add(new Orange());
    }

    /**
     * 通过判断运行时的对象类型来强制类型转换执行对应的重载方法
     * @param visitor
     */
    public void welcome(IVisitor visitor) {
        for (Fruit fruit: fruits) {
            if (fruit instanceof Apple) {
                visitor.chooseFruit((Apple)fruit);
            } else if (fruit instanceof Orange) {
                visitor.chooseFruit((Orange)fruit);
            } else if (fruit instanceof Banana) {
                visitor.chooseFruit((Banana)fruit);
            } else {
                throw new IllegalArgumentException("no type of such fruit");
            }
        }
    }

    /**
     * 通过抽象方法实现双分派
     * @param visitor
     */
    public void welcomeV2(IVisitor visitor) {
        for (Fruit fruit: fruits) {
            fruit.accept(visitor);
        }
    }

    /**
     * 这样我们就将重载方法模拟成了动态分派。这里的实现非常巧妙，由于 Java 调用重写方法时是动态分派的，所以 fruit.accept(visitor) 会调用具体子类的 accept 方法，在具体子类的 accept 方法中，调用 visitor.chooseFruit(this)，由于这个 accept 方法是属于具体子类的，所以这里的 this 一定是指具体的子类型，不会产生歧义。
     *
     * 再深入分析一下：之前的代码中，调用 visitor.chooseFruit(fruit) 这行代码时，由于重载方法不知道 Food 的具体子类型导致了编译失败，但实际上这时我们是可以拿到 Food 的具体子类型的。利用重写方法会动态分派的特性，我们在子类的重写方法中去调用这些重载的方法，使得重载方法使用起来也像是动态分派的一样。
     *
     */
}
