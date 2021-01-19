package creational.prototype.bean;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-19 20:56:22
 * @author: wanglong16@meicai.cn
 */
public class Tiger {

    private String name;

    private int age = 10;

    private double weight = 251.9;

    public Tiger(String name) {
        this.name = name;
    }

    public void grow() {
        age ++;
        weight += 30;
    }

    /**
     * 原型模式克隆
     * @return
     */
    public Tiger protoTypeClone() {
        Tiger tiger = new Tiger(name);
        tiger.weight = this.weight;
        tiger.age = this.age;
        return tiger;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
