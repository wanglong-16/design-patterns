package structural.composite;

import structural.composite.securtymode.Component;
import structural.composite.securtymode.Employee;
import structural.composite.securtymode.Manager;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-20 21:59:44
 * @author: wanglong16@meicai.cn
 */
public class Test {

    public static void main(String[] args) {
        Manager A = new Manager("大A");
        Component b = new Employee("小b");
        Component c = new Employee("小c");
        Component d = new Employee("小d");
        A.add(b);
        A.add(c);
        A.add(d);
        A.check();
    }
}
