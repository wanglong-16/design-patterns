package structural.composite.securtymode;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-20 21:52:39
 * @author: wanglong16@meicai.cn
 */
public class Employee extends Component {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void check() {
        System.out.println("员工" + name + "正在干活");
    }
}
