package structural.composite.lightmode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-20 21:51:03
 * @author: wanglong16@meicai.cn
 */
public class Manager implements Component{

    private String name;

    public Manager(String name) {
        this.name = name;
    }

    private List<Component> components = new ArrayList<>();
    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        component.remove(component);
    }

    @Override
    public void check() {
        System.out.println("管理层" + name + "监督工作：");
        for (Component c : components) {
            c.check();
        }
    }
}
