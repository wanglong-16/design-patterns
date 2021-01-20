package structural.composite.securtymode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-20 21:51:03
 * @author: wanglong16@meicai.cn
 */
public class Manager extends Component {

    private String name;

    public Manager(String name) {
        this.name = name;
    }

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void check() {
        System.out.println("管理层" + name + "监督工作：");
        for (Component c : components) {
            c.check();
        }
    }
}
